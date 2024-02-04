N = int(input())

for idx in range(N):
    print(' ' * (N - idx -1) + "*" * (2 * idx + 1))

for idx in range(N-2, -1, -1):
    print(' ' * (N - idx -1) + "*" * (2 * idx + 1))
