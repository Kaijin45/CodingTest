import sys
input = sys.stdin.readline
from collections import deque

length = int(input().strip())
apart = []
answer = []
visit = [[False for _ in range(length)] for _ in range(length)]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for _ in range(length):
    apart.append(input().strip())
    
for i in range(length):
    for j in range(length):
        if apart[i][j] == '1' and visit[i][j] == False:
            count = 1
            visit[i][j] = True
            queue = deque()
            queue.append((i, j))
            
            while queue:
                y, x = queue.popleft()
                for k in range(4):
                    nx = x + dx[k]
                    ny = y + dy[k]
                    if 0 <= nx < length and 0 <= ny < length and visit[ny][nx] == False and apart[ny][nx] == '1':
                        queue.append((ny, nx))
                        count += 1
                        visit[ny][nx] = True
            
            answer.append(count)
                
answer.sort()
print(len(answer))
for i in answer:
    print(i)
    