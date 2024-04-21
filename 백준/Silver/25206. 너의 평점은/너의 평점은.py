score = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'F': 0.0}

result = 0
tmp = 0
for _ in range(20):
    name, val1, val2 = input().split()
    if val2 == 'P':
        continue
    result += float(val1) * float(score[val2])
    tmp += float(val1)
print(result / tmp)