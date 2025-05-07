import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

node, edge, start_point = map(int, input().split())
adjacent_list = [[] for _ in range(node+1)]

for _ in range(edge):
    x, y = map(int, input().split())
    adjacent_list[x].append(y)
    adjacent_list[y].append(x)
    
for i in range(1, node+1):
    adjacent_list[i].sort()
    
visit_dfs = [0] * (node+1)
count = 0

def DFS(g, v, visit):
    global count
    count += 1
    visit[v] = count
    for i in g[v]:
        if visit[i] == 0:
            DFS(g, i, visit)
            
DFS(adjacent_list, start_point, visit_dfs)

for i in range(1, node+1):
    print(visit_dfs[i])