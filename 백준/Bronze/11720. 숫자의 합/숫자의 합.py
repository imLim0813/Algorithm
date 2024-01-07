num = int(input())
num_list = input()

tmp = 0
for idx in range(num):
    tmp += int(num_list[idx])

print(tmp)