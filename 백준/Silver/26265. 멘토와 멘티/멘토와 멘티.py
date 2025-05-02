import sys
input = sys.stdin.readline
mmlist = []
testcase = int(input().strip())

for _ in range(testcase):
    mmlist.append(list(input().split()))
    
mmlist.sort(key=lambda x: x[1], reverse=True)
mmlist.sort(key=lambda x: x[0])

for i in range(testcase):
    print(mmlist[i][0], mmlist[i][1])