n = int(input())

binaryNum = [0]*(n+2)

binaryNum[1] = 1
binaryNum[2] = 2

for i in range(3, n+1):
    binaryNum[i] = binaryNum[i-1] + binaryNum[i-2]
    binaryNum[i] = binaryNum[i] % 15746
    
print(binaryNum[n])