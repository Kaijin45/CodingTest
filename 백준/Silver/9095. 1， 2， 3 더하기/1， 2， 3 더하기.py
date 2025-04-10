testcase_num = int(input())

for _ in range(testcase_num):
    n = int(input())
    
    count = [0]*(n+1)
        
    for i in range(1, n+1):
        if i == 1:
            count[1] = 1
        elif i == 2:
            count[2] = 2
        elif i == 3:
            count[3] = 4
        else:
            count[i] = count[i-1] + count[i-2] + count[i-3]
    
    print(count[n])