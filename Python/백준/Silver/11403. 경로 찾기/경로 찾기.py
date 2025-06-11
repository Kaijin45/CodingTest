import sys
from collections import deque

vertex_num = int(sys.stdin.readline())
adj_list = [list(map(int, sys.stdin.readline().split())) for _ in range(vertex_num)]
visited = [[0]*vertex_num for _ in range(vertex_num)]

def BFS(x):
    queue = deque()
    queue.append(x)
    check = [0 for _ in range(vertex_num)]
    
    while queue:
        q = queue.popleft()
        
        for i in range(vertex_num):
            if check[i] == 0 and adj_list[q][i] == 1:
                queue.append(i)
                check[i] = 1
                visited[x][i] = 1
                
for i in range(vertex_num):
    BFS(i)
    
for i in visited:
    print(*i)