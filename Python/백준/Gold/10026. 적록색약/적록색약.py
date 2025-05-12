import sys
input = sys.stdin.readline
from collections import deque
sys.setrecursionlimit(10**4)

N = int(input())
if N == 1:
    print("1 1")
    sys.exit(0)
    
picture = []
visit_normal = [[False for _ in range(N)] for _ in range(N)]
visit_RG = [[False for _ in range(N)] for _ in range(N)]

for _ in range(N):
    picture.append(list(input().strip()))
    
count_normal = 0
count_RG = 0
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def BFS_RG(g, x, y, visit):
    queue = deque()
    queue.append((y,x))
    visit[y][x] = True
    rem = g[y][x]
    
    while queue:
        y, x = queue.popleft()
        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]
            if 0 <= nx < N and 0 <= ny < N and not visit[ny][nx]:
                if rem == 'R' or rem == 'G':
                    if g[ny][nx] == 'R' or g[ny][nx] == 'G':
                        queue.append((ny, nx))
                        visit[ny][nx] = True
                else:
                    if g[ny][nx] == 'B':
                        queue.append((ny, nx))
                        visit[ny][nx] = True
    
def BFS_normal(g, x, y, visit):
    queue = deque()
    queue.append((y,x))
    visit[y][x] = True
    rem = g[y][x]
    
    while queue:
        y, x = queue.popleft()
        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]
            if 0 <= nx < N and 0 <= ny < N and not visit[ny][nx] and g[ny][nx] == rem:
                queue.append((ny, nx))
                visit[ny][nx] = True
                
for i in range(N):
    for j in range(N):
        if not visit_normal[i][j]:
            BFS_normal(picture, j, i, visit_normal)
            count_normal += 1
        if not visit_RG[i][j]:
            BFS_RG(picture, j, i, visit_RG)
            count_RG += 1

print(count_normal, count_RG)