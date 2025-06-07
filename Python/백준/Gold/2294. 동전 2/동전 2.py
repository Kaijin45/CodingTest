import sys

n, k = map(int, sys.stdin.readline().split())
n_type = []
for _ in range(n):
    a = int(sys.stdin.readline())
    if a <= 10000:
        n_type.append(a)

n = len(n_type)
dp = [100000] * (k+1)
dp[0] = 0

for i in range(1, k+1):
    for j in range(n):
        if i - n_type[j] >= 0:
            dp[i] = min(dp[i], dp[(i - n_type[j])] + 1)

if dp[k] == 100000:
    print(-1)
else:
    print(dp[k])