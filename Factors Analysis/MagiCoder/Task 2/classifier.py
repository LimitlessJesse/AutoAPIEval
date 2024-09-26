import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import classification_report

df = pd.read_csv('magicoder_task2_classifier_instance_level.csv')
df = df.drop(columns = ['PackageName','ClassName','FolderPath','FileName','Method','Follow Format','Used Package','Compilable'])

# Drop rows with NaN
df.replace([np.inf, -np.inf], np.nan, inplace=True)
df.dropna(inplace=True)
df = df.drop(df[df.ppl > 50].index)

X = df.iloc[:, [1,2,3,4,5]]
y = df.iloc[:, 0]

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.2)

rf = RandomForestClassifier()

rf.fit(X_train, y_train)

y_pred = rf.predict(X_test)
print(rf.score(X_test, y_test))

print(classification_report(y_test, y_pred))

features = pd.DataFrame(rf.feature_importances_, index = X.columns)
print(features)
