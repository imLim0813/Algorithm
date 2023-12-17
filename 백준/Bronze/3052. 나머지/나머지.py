arr_lst = []

for i in range(10):
    arr_lst.append(int(input()) % 42)

arr_lst = list(set(arr_lst))
print(len(arr_lst))