text = input()
aList =[chr(i) for i in range(97,123)]

for alphabet in aList:
    print(text.find(alphabet), end=" ")