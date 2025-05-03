import sys
input = sys.stdin.readline

com_num = int(input().strip())
edge_num = int(input().strip())

graph = [[] for _ in range(com_num+1)]

for _ in range(edge_num):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)
    
visited = [False] * (com_num+1)

def DFS(g, v, visit):
    visit[v] = True
    for i in g[v]:
        if not visit[i]:
            DFS(g, i, visit)
DFS(graph, 1, visited)
answer = 0

for i in range(1, com_num+1):
    if visited[i]:
        answer += 1

print(answer-1)