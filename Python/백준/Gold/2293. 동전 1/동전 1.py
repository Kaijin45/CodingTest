import sys

coin_type, wanna_price = map(int, sys.stdin.readline().split())
each_coin_type = []
dp = [0] * (wanna_price+1)

for _ in range(coin_type):
    a = int(sys.stdin.readline())
    if a <= wanna_price:
        each_coin_type.append(a)
        
each_coin_type.sort(reverse=True)

for now_coin in each_coin_type:
    dp[now_coin] = 1
    for i in range(1, wanna_price+1):
        if i - now_coin >= 0:
            dp[i] = dp[i] + dp[i-now_coin]

print(dp[wanna_price])