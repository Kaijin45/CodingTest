num = int(input())
listA = list(map(int, input().split()))
dp = [1]*num

for i in range(1, num):
    for j in range(0, i):
        if listA[j] > listA[i]:
            dp[i] = max(dp[j]+1, dp[i])
            
print(max(dp))
