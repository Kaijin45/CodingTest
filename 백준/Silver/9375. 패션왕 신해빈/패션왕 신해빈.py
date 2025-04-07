total_test_case = int(input())
while(total_test_case):
    total_test_case -= 1
    having_cloths_num = {}
    
    wearing_things_num = int(input())
    if(wearing_things_num == 0):
        print(0)
        continue

    while(wearing_things_num):
        wearing_things_num -= 1
        
        clouth, type_of_it = input().split()
        
        if(type_of_it in having_cloths_num):
            having_cloths_num[type_of_it] = having_cloths_num[type_of_it] + 1
        else:
            having_cloths_num[type_of_it] = 1
    
    type_keys = list(having_cloths_num.keys())
    a = 1
    for i in type_keys:
        a = a * (having_cloths_num[i] + 1)
    a -= 1
    print(a)