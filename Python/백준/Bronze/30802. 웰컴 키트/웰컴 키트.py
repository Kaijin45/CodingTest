total = int(input())
people_num = list(map(int, input().split()))
t, p = map(int, input().split())

Tnum = 0

for i in people_num:
    if(i==0):
        continue
    elif i <= t:
        Tnum += 1
    elif i % t == 0:
        Tnum += i//t
    else:
        Tnum += i//t + 1

p_bundle = total // p
pen = total % p

print(Tnum)
print(f'{p_bundle} {pen}')