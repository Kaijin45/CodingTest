import sys
input = sys.stdin.readline

table_size, testcase = map(int, input().split())

table = []

for i in range(table_size):
    a = list(map(int, input().split()))
    table.append(a)

dp = [[0]*(table_size+1) for i in range(table_size+1)]

for i in range(1, table_size+1):
    for j in range(1, table_size+1):
        dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1] + table[i-1][j-1]

for _ in range(testcase):
    x1, y1, x2, y2 = map(int, input().split())
    check_sum = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1]
    print(check_sum)