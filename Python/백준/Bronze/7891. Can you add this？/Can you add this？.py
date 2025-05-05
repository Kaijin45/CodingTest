import sys
input = sys.stdin.readline

for _ in range(int(input().strip())):
    x, y = map(int, input().split())
    print(x+y)