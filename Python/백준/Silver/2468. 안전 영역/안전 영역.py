import sys
input = sys.stdin.readline
from collections import deque

N = int(input())
map_info = []
for _ in range(N):
    map_info.append(list(map(int, input().split())))
answer = 1

# map_info내의 N개 list 각각에서 가장 큰 값들만 모아 새로운 list를 만들고, 그 중의 최소/최대를 뽑아냄
min_val = min(map(min, map_info))
max_val = max(map(max, map_info))

def BFS(g, x, y, v, set_val):
    queue = deque([(y,x)])
    v[y][x] = True
    
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    
    while queue:
        y, x = queue.popleft()
        for k in range(4):
            nx, ny = x+dx[k], y+dy[k]
            if 0 <= nx < N and 0 <= ny < N and not v[ny][nx]:
                if g[ny][nx] > set_val:
                    queue.append((ny,nx))
                    v[ny][nx] = True
                    
for rain_level in range(min_val, max_val+1):
    visit = [[False for _ in range(N)]for _ in range(N)]
    count = 0
    for i in range(N):
        for j in range(N):
            if map_info[i][j] > rain_level and not visit[i][j]:
                count += 1
                BFS(map_info, j, i, visit, rain_level)
            else:
                visit[i][j] = True
    if count > answer:
        answer = count
        
print(answer)