import sys
input = sys.stdin.readline

testcase = int(input().strip())

for _ in range(testcase):
    x1, y1, x2, y2, x3, y3, x4, y4 = map(int, input().split())
    
    poster1 = (x2-x1)*(y2-y1)
    height = min(x4,x2) - max(x1, x3)
    width = min(y4, y2) - max(y1, y3)
    covered = 0
    if height>0 and width>0:
        covered = height*width
    print(poster1-covered)