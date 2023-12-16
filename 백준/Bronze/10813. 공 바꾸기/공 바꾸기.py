bag_num, cnt = map(int, input().split())
bag = [(i+1) for i in range(bag_num)]

for idx in range(cnt):
    tmp_1, tmp_2 = map(int, input().split())
    bag[tmp_1-1], bag[tmp_2-1] = bag[tmp_2-1], bag[tmp_1-1]

for val in bag:
    print(val, end=' ')