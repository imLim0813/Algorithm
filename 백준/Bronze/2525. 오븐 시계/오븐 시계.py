hour, minute = map(int, input().split())
plus = int(input())

minute += plus
hour += (minute // 60)
minute %= 60

print(f'{hour % 24} {minute}')