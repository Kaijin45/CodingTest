test_case_num = int(input())
p = [0]*102
p[1] = 1
p[2] = 1
p[3] = 1
i = 4

while(test_case_num):
    test_case_num -= 1
    
    target_val = int(input())
    if p[target_val]:
        print(p[target_val])
    else:
        for a in range(i, target_val + 1):
            p[a] = p[a-2] + p[a-3]
        i = target_val + 1
        print(p[target_val])