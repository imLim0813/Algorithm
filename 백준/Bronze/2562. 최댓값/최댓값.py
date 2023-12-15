arr_ = []

for i in range(9):
    arr_.append(int(input()))

print(max(arr_))
print(arr_.index(max(arr_)) + 1)
