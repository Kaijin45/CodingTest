import sys

# 집의 크기 받아오기
mapSize = int(sys.stdin.readline())
# 벽의 존재 확인하기
mapping = [list(map(int, sys.stdin.readline().split())) for _ in range(mapSize)]
# 해당 칸에 갈 수 있는 방법의 수 작성
dpR = [[0]*mapSize for _ in range(mapSize)]
dpD = [[0]*mapSize for _ in range(mapSize)]
dpRD = [[0]*mapSize for _ in range(mapSize)]
# 기본값 넣어주기
dpR[0][1] = 1

for i in range(mapSize):
    for j in range(2, mapSize):
        # 벽이 있으면 스킵
        if mapping[i][j] == 1:
            continue
        
        # 벽이 없다면 해당 위치에 올 수 있는 케이스들을 모두 더해준다.
        if i == 0:
            if mapping[i][j] == 0:
                dpR[i][j] = dpR[i][j-1]
            continue
        if i == 1:
            if mapping[i][j] == 0 and mapping[i][j-1] == 0 and mapping[i-1][j] == 0:
                dpRD[i][j] = dpR[i-1][j-1]
            if mapping[i][j] == 0:
                dpR[i][j] += dpR[i][j-1] + dpRD[i][j-1]
            continue
        if mapping[i][j] == 0:
            dpD[i][j] = dpD[i-1][j] + dpRD[i-1][j]
            dpR[i][j] = dpR[i][j-1] + dpRD[i][j-1]
        if mapping[i][j] == 0 and mapping[i-1][j] == 0 and mapping[i][j-1] == 0:
            dpRD[i][j] = dpRD[i-1][j-1] + dpR[i-1][j-1] + dpD[i-1][j-1]
        
print(dpD[mapSize-1][mapSize-1]+dpR[mapSize-1][mapSize-1]+dpRD[mapSize-1][mapSize-1])