import sys
input = sys.stdin.readline

total = int(input())
score_list = []

for _ in range(total):
    score_list.append(float(input()))
    
score_list.sort()

for i in range(7):
    print("{:.3f}".format(score_list[i]))