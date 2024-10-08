from transformers import pipeline
import torch
import json
import pandas as pd
import csv
import re
import sys
import openai

openai.api_key = 'YOUR_CHATGPT_KEY'

MAGICODER_PROMPT = """
Here is the description of the package: {package_description}
Here is the description of the class: {class_description}

@@ Instruction
{instruction}
recommend a list of useful with at most {snippet_number} apis for this package, 
DO NOT include method inherited from its parent class
For each api method specify its return type and parameters in the below format

format: return_type method_name()

For example:
1. `boolean add(E e)`: This method appends the specified element to the end of this list.
2. `void add(int index, E element)`: This method inserts the specified element at the specified position in this list.

@@ Response
"""

if sys.argv[1] == None:
  print("Package name not provided as command line argument")
  exit(1)

packageName = sys.argv[1]
packagePath = packageName.replace(".","_")

packageDescription = sys.argv[2]

print(f'Comparing Method If exist for {packageName}')

# create method dictionary
methodCSVFile = open(f'./Data/{packagePath}/{packagePath}Methods.csv', newline='')
methodReader = csv.DictReader(methodCSVFile)
methodRecord = {}

# Create dicionary for checking method
for row in methodReader:
  retType = row['Return Type']
  if "protected " in retType:
    retType = retType.replace("protected ","")
  if "abstract " in retType:
    retType = retType.replace("abstract ","")
  if "static " in retType:
    retType = retType.replace("static ","")

  method = row['Method']
  methodName = method[:method.index("(")]
  parameters = method[method.find("(")+1:method.find(")")]

  parametersList = parameters.split(",")
  paraStr = ""
  for p in parametersList:
    paraStr = paraStr + p[0:p.rfind(" ")].lstrip() + " "

  if row['ClassName'] not in methodRecord:
    methodRecord[row['ClassName']] = {}
  
  if methodName not in methodRecord[row['ClassName']]:
    methodRecord[row['ClassName']][methodName] = []
  
  methodRecord[row['ClassName']][methodName].append(retType + " " + paraStr)

# End of creating method dictionary

snippet_number = 5
outputFile = open(f'./Data/{packagePath}/{packagePath}_comparison.txt', 'w')

prompts = []

csvfile = open(f'./Data/{packagePath}/{packagePath}Classes.csv', newline='')
reader = csv.DictReader(csvfile)
classNameList = []

i = 0
for row in reader:
  
  classNameList.append(row['ClassName'])
  instruction = f"I want to use {packageName}.{row['ClassName']} package from Java"
  prompts.append(MAGICODER_PROMPT.format(package_description=packageDescription, class_description=row['Description'], instruction=instruction, snippet_number = snippet_number))
  i += 1

# CSV File for method checking
outputCSVFile = open(f'./Data/{packagePath}/{packagePath}MethodCheck.csv', 'w', newline='')
writer = csv.writer(outputCSVFile)
field = ["Sample Number", "ClassName", "Snippet Number", "Method", "Exist", "Description"]
writer.writerow(field)


i = 0
for prompt in prompts:
  message = [{"role": "user", "content": prompt}]
  chat = openai.ChatCompletion.create(
    model = "gpt-3.5-turbo",
    messages = message,
    temperature = 0
  )
  reply = chat.choices[0].message.content

  pattern = r'\d+\. \`(.*?)\`'
  matches = re.findall(pattern, reply)

  if matches:
    j = 1
    for match in matches:

      exist = False
      description = "NULL"

      try:
      
        if "public " in match:
          match = match.replace("public ", "")
      
        if "static " in match:
          match = match.replace("static ", "")

        metName = match[:match.index("(")]
        retType = metName[0:metName.rfind(" ")]
        metName = metName[metName.rfind(" ")+1:]

        parameters = match[match.find("(")+1:match.find(")")]
        parameters = parameters.split(",")
        paraStr = ""
        for pa in parameters:
          paraStr = paraStr + pa[0:pa.rfind(" ")].lstrip() + " "

        
        if classNameList[i] in methodRecord:
          if metName in methodRecord[classNameList[i]]:
            for r in methodRecord[classNameList[i]][metName]:
              if r == retType + " " + paraStr:
                exist = True
                description = r[1]
                break
      except Exception as e:
        print("Something went wrong, probably generated incorrect output: ", e)

      
      # exist = f'{match} {classNameList[i]}' in methodRecord or f'static {match} {classNameList[i]}' in methodRecord
      writer.writerow([i, classNameList[i], j, match, exist])
      j += 1

  outputFile.write(f'Sample: {i} {classNameList[i]}\n')
  outputFile.write('----------------------------------------------------------------\n')
  outputFile.write(f'{reply}\n')
  outputFile.write('================================================================\n\n')
  i += 1