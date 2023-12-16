bag_num, cnt = map(int, input().split(" "))
bag = [0 for i in range(bag_num)]

for idx in range(cnt):
    start, end, val = map(int, input().split(" "))
    for idx_ in range(start-1, end):
        bag[idx_] = val

for val in bag:
    print(val, end=' ')