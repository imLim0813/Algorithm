import sys

for num in range(int(sys.stdin.readline().strip())):
    num_ = sys.stdin.readline().strip()
    num1, num2 = map(int, num_.split())
    print(num1 + num2)