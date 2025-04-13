testcase = int(input())

for _ in range(testcase):
    k = int(input())
    n = int(input())
    
    count = [[j for j in range(n+1)] for i in range(k+1)]
    
    for i in range(1, k+1):
        for j in range(1, n+1):
            count[i][j] = count[i][j-1] + count[i-1][j]
    
    print(count[k][n])