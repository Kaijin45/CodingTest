n = int(input())
quest = list(map(int, input().split()))
max_val = [0]*n # 각 자리에서 최고값을 기록해줄 list
max_val[0] = quest[0]
answer = max_val[0]

for i in range(1, n):
    max_val[i] = max(max_val[i-1]+quest[i], quest[i])
    answer = max(answer, max_val[i])

print(answer) 