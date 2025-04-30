import sys
input = sys.stdin.readline
from collections import deque

n, m = map(int, input().split())
maze = []
for _ in range(n):
    maze.append(list(map(int, input().strip())))

visited = [[False for _ in range(m)]for _ in range(n)]
passed = [[0 for _ in range(m)] for _ in range(n)]

def BFS(x, y):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    
    queue = deque([(x,y)])
    passed[x][y] = maze[x][y]
    visited[x][y] = True
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx<0 or nx>=n or ny<0 or ny>=m:
                continue
            if maze[nx][ny] == 0:
                continue
            if maze[nx][ny] == 1 and not visited[nx][ny]:
                visited[nx][ny] = visited
                passed[nx][ny] = passed[x][y] + maze[nx][ny]
                queue.append((nx,ny))
    return passed[n-1][m-1]

print(BFS(0,0))