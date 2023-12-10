cnt, num = map(int, input().split())
arr = list(map(int, input().split()))

for idx in range(cnt):
    if (num > arr[idx]):
        print(arr[idx], end = " ")
        