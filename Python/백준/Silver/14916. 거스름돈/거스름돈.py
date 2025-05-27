money = int(input())

count_list = [-1] * (100001)
count_list[2] = 1
count_list[4] = 2
count_list[5] = 1

if money < 6:
    print(count_list[money])
    exit(0)
    
for i in range(6, money+1):
    if count_list[i-5] != -1 and count_list[i-2] != -1:
        count_list[i] = min(count_list[i-2]+1, count_list[i-5]+1)
        continue
    if count_list[i-2] != -1:
        count_list[i] = count_list[i-2]+1
        continue
    if count_list[i-5] != -1:
        count_list[i] = count_list[i-5]+1
        continue
        
print(count_list[money])