import sys
input = sys.stdin.readline

num = int(input())
wire = [[0 for _ in range(2)] for _ in range(num)]

for i in range(num):
    a, b = map(int, input().split())
    wire[i][0] = a
    wire[i][1] = b
    
wire.sort(key=lambda x:x[0])

dp = [1] * num

for i in range(1, num):
    for j in range(i):
        if wire[i][1] > wire[j][1]:
            dp[i] = max(dp[i], dp[j]+1)
            
print(num - max(dp))