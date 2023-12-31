num, cnt = map(int, input().split())

bag = [i+1 for i in range(num)]

for _ in range(cnt):
    idx_1, idx_2 = map(int, input().split())
    bag[idx_1-1 : idx_2] = [i for i in reversed(bag[idx_1-1 : idx_2])]

for i in bag:
    print(i, end = " ")