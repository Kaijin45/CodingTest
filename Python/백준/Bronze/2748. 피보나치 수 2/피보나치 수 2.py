import sys

num = int(input())

if num == 0:
    print("0")
    sys.exit(0)

if num == 1:
    print("1")
    sys.exit(0)
    
fibo_list = [0] * (num+1)
fibo_list[1] = 1

for i in range(2, num+1):
    fibo_list[i] = fibo_list[i-1] + fibo_list[i-2]
    
print(fibo_list[num])
