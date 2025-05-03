import sys
input = sys.stdin.readline

nodeNum = int(input().strip())
graph = list(input().split())
for _ in range(nodeNum-1):
    input()
testcase = int(input().strip())
for _ in range(testcase):
    n, m = map(int, input().split())
    if n == 0:
        print(graph[m])
    elif m == 0:
        print(graph[n])
    else:
        if graph[m] == '+' and graph[n] == '+':
            print('+')
        elif graph[m] == '-' and graph[n] == '-':
            print('+')
        else:
            print('-')
            
            