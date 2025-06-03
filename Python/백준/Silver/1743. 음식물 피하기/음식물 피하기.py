import sys
input = sys.stdin.readline
from collections import deque

height, width, num = map(int, input().split())
stage = [[0 for _ in range(width)] for _ in range(height)]

for _ in range(num):
    a, b = map(int, input().split())
    stage[a-1][b-1] = 1
    
visited = [[False for _ in range(width)] for _ in range(height)]

def BFS(graph, y, x, visit):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    queue = deque([(x, y)])
    visit[y][x] = True
    answer = 1
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx<0 or nx>=width or ny<0 or ny>=height:
                continue
            if graph[ny][nx] == 0:
                continue
            if not visit[ny][nx]:
                queue.append((nx, ny))
                answer += 1
                visit[ny][nx] = True
                
    return answer

maxi = 1

for i in range(height):
    for j in range(width):
        if stage[i][j] == 1 and not visited[i][j]:
            maxi = max(maxi, BFS(stage, i, j, visited))
            
print(maxi)