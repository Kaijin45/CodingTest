import sys
input = sys.stdin.readline
mmlist = []
testcase = int(input().strip())

for _ in range(testcase):
    mmlist.append(list(input().split()))
    
mmlist.sort(key=lambda x: x[0])
mmdic = {}

for i in mmlist:
    if i[0] in mmdic.keys():
        mmdic[i[0]].append(i[1])
    else:
        mmdic[i[0]] = [i[1]]
        
for i in mmdic:
    mmdic[i].sort(reverse = True)
    
for i in mmdic:
    for j in mmdic[i]:
        print(i, j)