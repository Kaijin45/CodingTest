from collections import deque

visit = [0 for _ in range(100001)]
subin, bro = map(int, input().split())
queue = deque()
queue.append(subin)

if subin == bro:
    print(0)
else:
    while visit[bro] == 0:
        i = queue.popleft()
        if i+1 < 100001:
            if visit[i+1] == 0:
                visit[i+1] = visit[i]+1
                queue.append(i+1)
        if i-1 >= 0:
            if visit[i-1] == 0:
                visit[i-1] = visit[i]+1
                queue.append(i-1)
        if 2*i < 100001:
            if visit[2*i] == 0:
                visit[2*i] = visit[i]+1
                queue.append(i*2)
    print(visit[bro])