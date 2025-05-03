import sys
input = sys.stdin.readline

size = int(input())
unsorted = []
for _ in range(size):
    unsorted.append(int(input().strip())) 
sorted_list = sorted(unsorted)

leastElement = 4
endButton = False

for i in range(0, size-1):   
    need = 4
    for j in range(i+1, size):
        if sorted_list[j] - sorted_list[i] > 4:
            break
        else:
            need -= 1
            if leastElement > need:
                leastElement = need
            if leastElement == 0:
                endButton = True
                break
    if endButton:
        break

print(leastElement)