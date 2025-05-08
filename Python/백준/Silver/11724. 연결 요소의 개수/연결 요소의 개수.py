import sys
input = sys.stdin.readline
from collections import deque

node, edge = map(int, input().split())
adj_list = [[] for _ in range(node+1)]
visited = [False] * (node+1)
connected_component = 0

for _ in range(edge):
    x, y = map(int, input().split())
    adj_list[x].append(y)
    adj_list[y].append(x)

def BFS(g, v, visit):
    queue = deque([v])
    visit[v] = True
    
    while queue:
        vv = queue.popleft()
        for i in g[vv]:
            if not visit[i]:
                queue.append(i)
                visit[i] = True
                
for i in range(1, node+1):
    if not visited[i]:
        connected_component += 1
        BFS(adj_list, i, visited)

print(connected_component)