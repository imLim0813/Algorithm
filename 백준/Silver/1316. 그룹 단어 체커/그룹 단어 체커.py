repeat_num = int(input())
N = repeat_num

for _ in range(repeat_num):
    text = input()
    for idx in range(text.__len__() - 1):
        if (text[idx] != text[idx+1]) and (text[idx] in text[idx+2:]):
            N -= 1
            break
print(N)