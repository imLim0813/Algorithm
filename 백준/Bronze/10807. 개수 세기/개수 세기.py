cnt = int(input())
num_arr = map(int, input().split())
find_num = int(input())
ans = 0

for num in num_arr:
    if (num == find_num):
        ans += 1

print(ans)