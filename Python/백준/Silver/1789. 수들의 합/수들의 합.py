sumValue = int(input())
calculation = sumValue

if sumValue == 1:
    print(1)
    exit(0)

for i in range(1, sumValue+1):
    if calculation >= i:
        calculation -= i
    else:
        print(i-1)
        break