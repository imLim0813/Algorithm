tmp = int(input())
num = (tmp // 4) if tmp % 4 == 0 else (tmp // 4) + 1
tmp = ["long " for i in range(num)]
tmp.append("int")
print(''.join(tmp))
