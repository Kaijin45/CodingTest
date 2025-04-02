N = int(input())

if(N<10):
    print(N)
    exit(0)

digit = 2
maximum = 0
N = N - 9
    
while(1):
    maximum = 9*(10**(digit-1))*digit
    if(maximum >= N):
        break
    digit += 1
    N = N - maximum

N-=1
wanted_num = 10**(digit-1) + N/digit
order = N%digit
wanted_num_str = str(wanted_num)
print(wanted_num_str[order])