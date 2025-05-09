import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

node = int(input())
adj_list = [[] for _ in range(node+1)]
for _ in range(node-1):
    x, y = map(int, input().split())
    adj_list[x].append(y)
    adj_list[y].append(x)
    
visit = [0]*(node+1)

def dfs(x):
    for i in adj_list[x]:
        if visit[i] == 0:
            visit[i] = x
            dfs(i)
            
dfs(1)

for i in range(2, node+1):
    print(visit[i])