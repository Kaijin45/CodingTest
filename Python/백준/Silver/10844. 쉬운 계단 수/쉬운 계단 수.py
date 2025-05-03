n = int(input())

count = [[0] * 10 for _ in range(n)]

count[0] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1]

for i in range(1,n):
    count[i][0] = count[i-1][1]
    count[i][9] = count[i-1][8]
    
    for j in range(1, 9):
        count[i][j] = count[i-1][j-1] + count[i-1][j+1]

print(sum(count[n-1])%1000000000)