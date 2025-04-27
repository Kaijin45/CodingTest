import sys
input = sys.stdin.readline
from collections import deque

vertex_num, edge_num, start_point = map(int, input().split())

adjacent_list = [[] for _ in range(vertex_num+1)]
for _ in range(edge_num):
    x, y = map(int, input().split())
    adjacent_list[x].append(y)
    adjacent_list[y].append(x)
    
for i in range(1, vertex_num+1):
    adjacent_list[i] = sorted(adjacent_list[i])
    
visited_dfs = [False] * (vertex_num+1)
visited_bfs = [False] * (vertex_num+1)

def DFS(g, v, visit):
    visit[v] = True
    print(v, end = ' ')
    for i in g[v]:
        if not visit[i]:
            DFS(g, i, visit)

def BFS(g, v, visit):
    queue = deque([v])
    visit[v] = True
    
    while queue:
        vv = queue.popleft()
        print(vv, end=' ')
        for i in g[vv]:
            if not visit[i]:
                queue.append(i)
                visit[i] = True
                
DFS(adjacent_list, start_point, visited_dfs)
print()
BFS(adjacent_list, start_point, visited_bfs)