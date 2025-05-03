quest = list(map(int, input()))
buying = [0]*10

for i in quest:
    if i == 9:
        buying[6] += 1
    else:
        buying[i] += 1

if buying[6]%2 == 0:
    buying[6] = buying[6] // 2
else:
    buying[6] = buying[6] // 2 + 1

print(max(buying))