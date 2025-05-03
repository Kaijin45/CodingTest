N = int(input())

if N == 1:
    print(1)
elif N == 2:
    print(1)
else:
    Pnumber = [0]*(N+1)
    Pnumber[1] = 1
    Pnumber[2] = 1
    for i in range(3, N+1):
        Pnumber[i] = Pnumber[i-1] + Pnumber[i-2]
    print(Pnumber[N])