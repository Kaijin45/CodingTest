import sys
input = sys.stdin.readline
from collections import deque

node, edge = map(int, input().split())
adj_list = [[] for _ in range(node+1)]
visited = [0] * (node+1)

for _ in range(edge):
    x, y = map(int, input().split())
    adj_list[x].append(y)
    adj_list[y].append(x)

def BFS(g, v, visit):
    queue = deque([v])
    visit[v] = visit[0]
    
    while queue:
        vv = queue.popleft()
        for i in g[vv]:
            if visit[i] == 0:
                queue.append(i)
                visit[i] = visit[0]
                
for i in range(1, node+1):
    if visited[i] == 0:
        visited[0] += 1
        BFS(adj_list, i, visited)

print(visited[0])