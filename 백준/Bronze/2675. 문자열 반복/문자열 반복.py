for cnt in range(int(input())):
    idx, text = input().split()
    for txt in text:
        print(txt * int(idx), end="")
    print()