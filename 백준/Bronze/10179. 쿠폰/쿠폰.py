import sys
input = sys.stdin.readline

for _ in range(int(input().strip())):
    x = float(input().strip())
    print("$%.2f"%round(x*0.8,2))