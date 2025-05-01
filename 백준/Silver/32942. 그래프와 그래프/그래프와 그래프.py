import sys
input = sys.stdin.readline

a, b, c = map(int, input().split())

if b == 0:
    if c%a == 0:
        for i in range(1, 11):
            if c//a == i:
                print("1 2 3 4 5 6 7 8 9 10")
            else:
                print(0)
    else:
        for _ in range(10):
            print(0)
    sys.exit(0)
    
if a == 0:
    if c%b == 0 and 0 < c//b < 11:
        for _ in range(10):
            print(c//b)
    else:
        for _ in range(10):
            print(0)
    sys.exit(0)

for i in range(1, 11):
    answer = (c-a*i)//b
    if (c-a*i)%b == 0 and 0 < answer < 11:
        print(answer)
    else:
        print(0)