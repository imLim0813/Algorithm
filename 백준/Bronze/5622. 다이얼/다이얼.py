alphabet = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]

input_ = input()

ans = 0
for text in input_:
    for idx, tmp in enumerate(alphabet):
       if text in tmp:
           ans += idx + 3
       else:
           pass

print(ans)