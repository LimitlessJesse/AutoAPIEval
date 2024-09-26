import pandas as pd
import numpy as np
from scipy.stats import mannwhitneyu
from cliffs_delta import cliffs_delta

df = pd.read_csv('magicoder_task2_classifier_instance_level.csv')

df.replace([np.inf, -np.inf], np.nan, inplace=True)
df.dropna(inplace=True)
df = df.drop(df[df.ppl > 50].index)

group_true_ppl = df[df['Runnable'] == True]['ppl']
group_false_ppl = df[df['Runnable'] == False]['ppl']

group_true_popularity = df[df['Runnable'] == True]['API_popularity']
group_false_popularity = df[df['Runnable'] == False]['API_popularity']

group_true_length = df[df['Runnable'] == True]['API_length']
group_false_length = df[df['Runnable'] == False]['API_length']

group_true_confidence = df[df['Runnable'] == True]['Consistency']
group_false_confidence = df[df['Runnable'] == False]['Consistency']

group_true_self = df[df['Runnable'] == True]['Self_reflection']
group_false_self = df[df['Runnable'] == False]['Self_reflection']

u_stat, p_value = mannwhitneyu(group_true_popularity, group_false_popularity)
print(f'API_popularity Mann-Whitney U stat: {u_stat}')
print(f'API_popularity P-value : {p_value}')
print(f'Exist True Mean {group_true_popularity.mean()}\nExist False Mean {group_false_popularity.mean()}')
delta, size = cliffs_delta(group_true_popularity, group_false_popularity)
print(f"API_popularity Cliff's Delta: {delta}")
print(f"API_popularity Effect Size: {size}")
print()
print()

u_stat, p_value = mannwhitneyu(group_true_length, group_false_length)
print(f'API_length Mann-Whitney U stat: {u_stat}')
print(f'API_length Length P-value : {p_value}')
print(f'Exist True Mean {group_true_length.mean()}\nExist False Mean {group_false_length.mean()}')
delta, size = cliffs_delta(group_true_length, group_false_length)
print(f"API_length Cliff's Delta: {delta}")
print(f"API_length Effect Size: {size}")
print()
print()

u_stat, p_value = mannwhitneyu(group_true_ppl, group_false_ppl)
print(f'PPL Mann-Whitney U stat: {u_stat}')
print(f'PPL P-value : {p_value}')
print(f'Exist True Mean {group_true_ppl.mean()}\nExist False Mean {group_false_ppl.mean()}')
delta, size = cliffs_delta(group_true_ppl, group_false_ppl)
print(f"PPL Cliff's Delta: {delta}")
print(f"PPL Effect Size: {size}")
print()
print()

u_stat, p_value = mannwhitneyu(group_true_confidence, group_false_confidence)
print(f'Consistency Mann-Whitney U stat: {u_stat}')
print(f'Consistency P-value : {p_value}')
print(f'Exist True Mean {group_true_confidence.mean()}\nExist False Mean {group_false_confidence.mean()}')
delta, size = cliffs_delta(group_true_confidence, group_false_confidence)
print(f"Consistency Cliff's Delta: {delta}")
print(f"Consistency Effect Size: {size}")
print()
print()

u_stat, p_value = mannwhitneyu(group_true_self, group_false_self)
print(f'Self_reflection Mann-Whitney U stat: {u_stat}')
print(f'Self_reflection P-value : {p_value}')
print(f'Exist True Mean {group_true_self.mean()}\nExist False Mean {group_false_self.mean()}')
delta, size = cliffs_delta(group_true_self, group_false_self)
print(f"Self_reflection Cliff's Delta: {delta}")
print(f"Self_reflection Effect Size: {size}")
print()
print()

# ------------------------------------