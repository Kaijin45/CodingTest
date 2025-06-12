import sys
input = sys.stdin.readline

def dfs(node, cnt):
    visit[node] = 1
    for adjNode in canMove[node]:
        if not visit[adjNode]:
            cnt = dfs(adjNode, cnt + 1)
    return cnt

testcase = int(input())
for _ in range(testcase):
    nationNum, flightType = map(int, input().split())
    canMove = [[] for _ in range(nationNum+1)]
    for i in range(flightType):
        a, b = map(int, input().split())
        canMove[a].append(b)
        canMove[b].append(a)
    visit = [0]*(nationNum+1)
    print(dfs(1,0))