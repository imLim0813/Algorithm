tmp = int(input())
num = int(input())

sum = 0
for i in range(num):
    a, b = map(int, input().split())
    sum += (a * b)
    
if tmp == sum:
    print("Yes")
else:
    print("No")