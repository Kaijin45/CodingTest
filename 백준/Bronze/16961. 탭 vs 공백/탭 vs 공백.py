N = int(input())
fight_check = [0]*367
guest_count = [0]*367
VIP_book = 0

while(N):
    N -= 1
    
    c, s, e = input().split()
    s = int(s)
    e = int(e)
    
    if c == 'T':
        for i in range(s,e+1):
            fight_check[i] += 1
            guest_count[i] += 1
    else:
        for i in range(s,e+1):
            fight_check[i] -= 1
            guest_count[i] += 1
    
    if ((e-s+1) > VIP_book):
        VIP_book = e-s+1
    
guest_count_checker = 0
most_booker_day = 0
no_fighting_days = 0
no_fight_day_most_booker_num = 0

for i in range(1, 367):
    if guest_count[i]:
        guest_count_checker += 1
        if (not fight_check[i]):
            no_fighting_days += 1
            if guest_count[i] > no_fight_day_most_booker_num:
                no_fight_day_most_booker_num = guest_count[i]
    if guest_count[i] > most_booker_day:
        most_booker_day = guest_count[i]

print(guest_count_checker)
print(most_booker_day)
print(no_fighting_days)
print(no_fight_day_most_booker_num)
print(VIP_book) 