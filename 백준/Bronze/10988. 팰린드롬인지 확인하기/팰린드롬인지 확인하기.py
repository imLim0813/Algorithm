def palindrome(N):
    half = N.__len__() // 2
    for idx in range(half):
        if N[idx] != N[N.__len__() - idx - 1]:
            return 0
    return 1

N = input()
print(palindrome(N))

