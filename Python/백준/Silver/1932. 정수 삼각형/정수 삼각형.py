import sys
input = sys.stdin.readline

size = int(input())

list_val = []
dp = []
initial_value = [int(input())]
list_val.append(initial_value)
dp.append(initial_value)

for i in range(1, size):
    a = list(map(int, input().split()))
    b = a[:]
    list_val.append(a)
    dp.append(b)
    
    for j in range(0, i):
        if j == 0:
            dp[i][0] = dp[i][0] + dp[i-1][0]
            dp[i][1] = dp[i][1] + dp[i-1][0]
        else:
            dp[i][j] = max(dp[i][j], list_val[i][j] + dp[i-1][j])
            dp[i][j+1] += dp[i-1][j]

print(max(dp[size-1]))
