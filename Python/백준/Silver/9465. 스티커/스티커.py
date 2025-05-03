import sys
input = sys.stdin.readline

testcase = int(input())

for _ in range(testcase):
    length = int(input())
    upper = list(map(int, input().split()))
    lower = list(map(int, input().split()))
    count_max_upper = [0]*(length+2)
    count_max_lower = [0]*(length+2)
    count_max_upper[1] = upper[0]
    count_max_lower[1] = lower[0]
    for i in range(2, length+1):
        count_max_upper[i] = max(count_max_upper[i-2]+upper[i-1], count_max_lower[i-2]+upper[i-1], count_max_lower[i-1]+upper[i-1])
        count_max_lower[i] = max(count_max_lower[i-2]+lower[i-1], count_max_upper[i-2]+lower[i-1], count_max_upper[i-1]+lower[i-1])
        
    print(max(count_max_lower[length], count_max_upper[length]))