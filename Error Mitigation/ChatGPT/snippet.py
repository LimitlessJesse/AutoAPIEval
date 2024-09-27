from transformers import pipeline
import torch
import json
import pandas as pd
import csv
import re
import os
import sys
import openai

openai.api_key = 'YOUR_CHATGPT_KEY'

MAGICODER_PROMPT = """
@@ Context
Here is the description of the package: {package_description}
Here is the description of the class: {class_description}
Here is the description of the method: 
{method_description}

@@ Instruction
I want to learn how to use {method} from {package}.{className}
Generate a complete code snippet of this method. The code snippet needs to be executable with import statement and put the method and code snippet in the format below:

Code snippet:
public class Main {{
    public static void main(String[] args) {{
        
    }}
}}

For example:
`boolean add(E e)`: This method appends the specified element to the end of this list.

Code snippet:
```java
import java.util.ArrayList;

public class Main {{
    public static void main(String[] args) {{
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);
    }}
}}

@@ Response
"""

if sys.argv[1] == None:
  print("Package name not provided as command line argument")
  exit(1)

packageName = sys.argv[1]
packagePath = packageName.replace(".","_")

packageDescription = sys.argv[2]

if not os.path.exists(f"./Data/{packagePath}/javaFiles"):
  os.makedirs(f"./Data/{packagePath}/javaFiles")

print(f'Generating Code Snippet for {packageName}')

classCsvfile = open(f'./Data/{packagePath}/{packagePath}Classes.csv', newline='')
classReader = csv.DictReader(classCsvfile)
classDescriptionDict = {}

for row in classReader:
  classDescriptionDict[row['ClassName']] = row['Description']

snippet_number = 5
outputFile = open(f'./Data/{packagePath}/{packagePath}_snippet.txt', 'w')

prompts = []

csvfile = open(f'./Data_Description/{packagePath}/{packagePath}MethodCheck.csv', newline='')
reader = csv.DictReader(csvfile)
classNameList = []
fileNameList = []
i = 0
for row in reader:
  if row['Exist'] == 'True':
    classNameList.append(row['ClassName'])
    fileNameList.append(f'{row["ClassName"]}_{row["Snippet Number"]}')
    prompts.append(MAGICODER_PROMPT.format(package_description=packageDescription, class_description=classDescriptionDict[row['ClassName']], method_description=row['Full Description'], method=row['Method'], package=packageName, className=row['ClassName']))
    i += 1
  

# CSV File for method checking
outputCSVFile = open(f'./Data/{packagePath}/{packagePath}SnippetRecord.csv', 'w', newline='')
writer = csv.writer(outputCSVFile)
field = ["FileName", "UsedPackage"]
writer.writerow(field)

i = 0
for prompt in prompts:

  message = [{"role": "user", "content": prompt}]
  chat = openai.ChatCompletion.create(
    model = "gpt-3.5-turbo",
    messages = message,
    temperature = 0
  )

  print(f"Generating prompt: {i}")
  reply = chat.choices[0].message.content

  pattern = r'\`\`\`java\n(.*?)\`\`\`'
  matches = re.findall(pattern, reply, re.DOTALL)
  
  if matches:
    for match in matches:
      if classNameList[i] in match:
        fileNameList[i] = fileNameList[i].replace('.', '_')
        writer.writerow([fileNameList[i], "True"])

        # create java file
        match = match.replace("Main", fileNameList[i])
        javaFile = open(f'./Data/{packagePath}/javaFiles/{fileNameList[i]}.java', 'w')
        javaFile.write(match)

      else:
        writer.writerow([fileNameList[i], "False"])
  else:
    writer.writerow([fileNameList[i], "False"])

  outputFile.write(f'Sample: {i} {fileNameList[i]}\n')
  outputFile.write('----------------------------------------------------------------\n')
  outputFile.write(f'{reply}\n')
  outputFile.write('================================================================\n\n')
  i += 1
