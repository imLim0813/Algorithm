text = [val for val in input().upper()]

dict_alphabet = {}
for i in text:
    if i in dict_alphabet.keys():
        pass
    else:
        dict_alphabet[i] = text.count(i)

answer = sorted(dict_alphabet.items(), key= lambda x : x[1], reverse=True)

try:
    if answer[0][1] == answer[1][1]:
        print('?')
    else:
        print(answer[0][0])
except:
    print(answer[0][0])