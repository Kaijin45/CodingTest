n, m = map(int, input().split())
answer = 1

for i in range(n, n-m, -1):
    answer = answer * i
    
for i in range(1, m+1):
    answer = answer // i
    
print(answer)