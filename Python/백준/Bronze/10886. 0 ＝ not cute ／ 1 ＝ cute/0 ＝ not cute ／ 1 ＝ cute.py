import sys
input = sys.stdin.readline

n = int(input())
count = 0
for _ in range(n):
    if int(input()) == 1:
        count += 1
        
if count > (n-count):
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")