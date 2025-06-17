import sys

num = int(sys.stdin.readline())
num_list = list(map(int, sys.stdin.readline().split()))
cal_list = list(map(int, sys.stdin.readline().split()))
maximum = -1e9
minimum = 1e9

def dfs(depth, total, plus, minus, multiply, divide):
    global maximum, minimum
    if depth == num:
        maximum = max(total, maximum)
        minimum = min(total, minimum)
        return

    if plus:
        dfs(depth + 1, total + num_list[depth], plus - 1, minus, multiply, divide)
    if minus:
        dfs(depth + 1, total - num_list[depth], plus, minus - 1, multiply, divide)
    if multiply:
        dfs(depth + 1, total * num_list[depth], plus, minus, multiply - 1, divide)
    if divide:
        dfs(depth + 1, int(total / num_list[depth]), plus, minus, multiply, divide - 1)


dfs(1, num_list[0], cal_list[0], cal_list[1], cal_list[2], cal_list[3])
print(maximum)
print(minimum)