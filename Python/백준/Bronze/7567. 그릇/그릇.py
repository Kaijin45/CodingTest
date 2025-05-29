plate = list(input())
num = len(plate)
count = 10

for i in range(1, num):
    if plate[i] == plate[i-1]:
        count += 5
    else:
        count += 10
        
print(count)