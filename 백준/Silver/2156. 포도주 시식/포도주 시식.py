n = int(input())
wine = [0]*10000

for i in range(n):
    wine[i] = int(input())
    
maximum = [0]*10000
maximum[0] = wine[0]
maximum[1] = wine[0] + wine[1]
maximum[2] = max(wine[0] + wine[2], wine[1] + wine[2], maximum[1])

for i in range(3, n):
    maximum[i] = max(maximum[i-2] + wine[i], maximum[i-3] + wine[i-1] + wine[i], maximum[i-1])

print(max(maximum))