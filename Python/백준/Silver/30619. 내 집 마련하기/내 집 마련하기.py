N = int(input())

home = list(map(int, input().split()))

i = int(input())

while(i>0):
    i-=1
    L, R = map(int, input().split())
    home1 = home[:]
    L1 = L
    for j in range(N):
        if (home1[j] >= L and home1[j] <= R):
            home1[j] = L1
            L1 += 1
    print(*home1)
        