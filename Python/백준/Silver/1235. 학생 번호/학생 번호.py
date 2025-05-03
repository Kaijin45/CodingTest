import sys
input = sys.stdin.readline

total = int(input())
st_num = []
answer = 7

for _ in range(total):
    st_num.append(input())
    
length = len(st_num[0])
answer = length -1

for i in range(1, length):
    checker = set()
    for j in range(total):
        checker.add(st_num[j][i:])
    if len(checker) == total:
        answer -= 1
    else:
        break
print(answer)