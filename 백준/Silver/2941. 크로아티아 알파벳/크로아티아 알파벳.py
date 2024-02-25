c_alphabet = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

text = input()

for val in c_alphabet:
    if val in text:
        text = text.replace(val, "0")

print(text.__len__())