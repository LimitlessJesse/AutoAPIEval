import os, csv

csvfile = open('allPackage.csv', newline='')
reader = csv.DictReader(csvfile)

for row in reader:
  os.system(f"python execute.py {row['PackageName']}")
  