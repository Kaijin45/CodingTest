n = int(input())

price = list(map(int, input().split()))
pList = [0]*(n+2)
pList[1] = price[0]
pList[2] = max(price[1], pList[1]+price[0])

for i in range(2, len(price)):
    for j in range(1,i):
        pList[i+1] = max(price[i], pList[j]+pList[i-j+1], pList[i+1])
    
if n < len(price) + 1:
    print(pList[n])
else:
    sets = n//len(price)
    remainer = n%len(price)
    print(sets*pList[len(price)]+pList[remainer])
    
