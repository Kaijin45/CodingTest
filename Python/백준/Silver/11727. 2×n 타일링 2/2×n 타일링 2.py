n = int(input())

method = [0]*(n+1)

for i in range(1, n+1):
    if i == 1:
        method[1] = 1
    elif i == 2:
        method[2] = 3
    else:
        method[i] = method[i-1] + 2*(method[i-2])

method[0] = method[n]%10007
print(method[0])