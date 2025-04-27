import sys
input = sys.stdin.readline

testcase = int(input().strip())
for _ in range(testcase):
    N = int(input().strip())
    for i in range(1, N+1):
        x, y = map(int, input().split())
        print(str(i)+' '+str(x+1)+' '+str(y+100000000))