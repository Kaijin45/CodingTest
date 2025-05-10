import sys
input = sys.stdin.readline
from collections import deque

width, height = 0, 0
dx = [-1, 1, 0 ,0, -1, 1, -1, 1]
dy = [0, 0, -1, 1, -1, 1, 1, -1]

while True:
    width, height = map(int, input().split())
    mapping = []
        
    if width == 0 and height == 0:
        break
        
    for _ in range(height):
        mapping.append(list(map(int, input().split())))
    
    island = 0
    visit = [[False for _ in range(width)] for _ in range(height)]
    
    for i in range(height):
        for j in range(width):
            if mapping[i][j] == 0 or visit[i][j] == True:
                continue
            island += 1
            queue = deque([(i,j)])
            visit[i][j] = True
            while queue:
                y, x = queue.popleft()
                for k in range(8):
                    nx = x + dx[k]
                    ny = y + dy[k]
                    if nx<0 or nx>=width or ny<0 or ny>=height:
                        continue
                    if mapping[ny][nx] == 0:
                        continue
                    if mapping[ny][nx] == 1 and not visit[ny][nx]:
                        visit[ny][nx] = True
                        queue.append((ny,nx))
    print(island)