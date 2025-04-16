import sys
input = sys.stdin.readline

testcase = int(input())
for _ in range(testcase):
    h, w, n = map(int, input().split())
    whatH = n%h
    whatW = n//h+1
    
    if whatH == 0:
        whatH = h
        whatW -= 1
    
    if whatW < 10:
        whatW = '0'+str(whatW)
    else:
        whatW = str(whatW)
    print(str(whatH)+whatW)