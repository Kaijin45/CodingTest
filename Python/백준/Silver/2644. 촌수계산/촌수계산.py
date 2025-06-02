import sys
input = sys.stdin.readline

total_people = int(input())
wanna_know1, wanna_know2 = map(int, input().split())
relation_num = int(input())

relation_map = [[] for _ in range(total_people+1)]
visited = [-1] * (total_people+1)

for _ in range(relation_num):
    a, b = map(int, input().split())
    relation_map[a].append(b)
    relation_map[b].append(a)
    
def DFS(g, v, visit, answer):
    visit[v] = answer
    for i in g[v]:
        if visit[i] == -1:
            DFS(g, i, visit, answer+1)
            
DFS(relation_map, wanna_know1, visited, 0)
print(visited[wanna_know2])