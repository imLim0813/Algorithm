hour, minute = map(int, input().split())

minute_tmp = minute - 45

if minute_tmp >= 0:
    minute = minute_tmp
else:
    minute = minute_tmp + 60
    hour_tmp = hour - 1
    if hour_tmp >= 0:
        hour = hour_tmp
    else:
        hour = 24 + hour_tmp
    
print(f'{hour} {minute}')