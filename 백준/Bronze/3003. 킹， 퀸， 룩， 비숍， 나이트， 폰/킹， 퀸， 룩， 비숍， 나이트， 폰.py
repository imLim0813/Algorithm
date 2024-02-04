chess_list=[i for i in "112228"]

tmp = list(input().split(" "))

for tmp_1, tmp_2 in zip(chess_list, tmp):
    print(int(tmp_1) - int(tmp_2))