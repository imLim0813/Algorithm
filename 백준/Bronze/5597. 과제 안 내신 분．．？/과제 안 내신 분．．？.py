tmp_arr = [(i+1) for i in range(30)]

for i in range(28):
    tmp_arr.remove(int(input()))

print(tmp_arr[0])
print(tmp_arr[-1])