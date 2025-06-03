n, k = map(int, input().split())
dp = [1] * (n+1)

for i in range(2, n+1):
    dp[i] = i * dp[i-1]
    
answer = dp[n] // (dp[k] * dp[n-k])
answer %= 10007

print(int(answer))