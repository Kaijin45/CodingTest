num = int(input())

if num == 1:
    print(10)
    exit(0)

dp = [1] * 10

for _ in range(1, num):
    for j in range(1, 10):
        dp[j] = dp[j] + dp[j-1]

answer = dp[0] + dp[1] + dp[2] + dp[3] + dp[4] + dp[5] + dp[6] + dp[7] + dp[8] + dp[9]
print(answer%10007)