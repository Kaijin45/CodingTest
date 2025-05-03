n = int(input())
count = [0] * (n+1)

for i in range(1, n+1):
    if i == 1:
        count[1] = 1
    elif i == 2:
        count[2] = 2
    else:
        count[i] = count[i-1] + count[i-2]

count[0] = count[n] % 10007
print(count[0])