import sys
input = sys.stdin.readline

item_num, weight_upperbound = map(int, input().split())
value_based_limit = [[0 for _ in range(weight_upperbound+1)] for _ in range(item_num+1)]

for i in range(1, item_num+1):
    weight, value = map(int, input().split())
    
    for j in range(1, weight_upperbound+1):
        if j < weight:
            value_based_limit[i][j] = value_based_limit[i-1][j]
        else:
            value_based_limit[i][j] = max(value_based_limit[i-1][j], value_based_limit[i-1][j-weight]+value)

print(value_based_limit[item_num][weight_upperbound])
