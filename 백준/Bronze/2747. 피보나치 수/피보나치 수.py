n = int(input())
fibo = [0]*(n+2)

fibo[1] = 1
fibo[2] = 1

for i in range(3, n+1):
    fibo[i] = fibo[i-1] + fibo[i-2]
    
print(fibo[n])