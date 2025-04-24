import sys
lines = sys.stdin.readlines()
for line in lines:
    eachline = list(map(int, line.split()))
    checker = [0]*(eachline[0])
    factcheck = True
    for i in range(1, eachline[0]):
        diff = abs(eachline[i]-eachline[i+1])
        if diff >= eachline[0]:
            factcheck = False
            break
        if checker[diff] == 0:
            checker[diff] = 1
        else:
            factcheck = False
            break
    if factcheck:
        print("Jolly")
    else:
        print("Not jolly")
    