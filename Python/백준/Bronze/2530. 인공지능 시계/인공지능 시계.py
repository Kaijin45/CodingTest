hour, minute, second = map(int, input().split())
time_sec = int(input())

second = (second + time_sec)
minute = (minute + second//60)
hour = (hour + minute//60)

print("%d %d %d"%(hour%24, minute%60, second%60))