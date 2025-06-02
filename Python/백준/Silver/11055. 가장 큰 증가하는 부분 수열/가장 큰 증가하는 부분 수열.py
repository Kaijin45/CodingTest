size = int(input())
A_list = list(map(int, input().split()))
sum_list = A_list.copy()

for i in range(1, size):
    for j in range(i):
        if A_list[i] > A_list[j]:
            sum_list[i] = max(sum_list[i], sum_list[j] + A_list[i])
            
print(max(sum_list))