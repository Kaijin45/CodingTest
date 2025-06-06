num = int(input())
listA = list(map(int, input().split()))

dp_length = [1]*num
dp_sequence = []

for i in range(num):
    dp_sequence.append([listA[i]])

for i in range(1, num):
    for j in range(0, i):
        if listA[j] < listA[i]:
            if dp_length[i] < dp_length[j] + 1:
                dp_length[i] = dp_length[j] + 1
                temp = [listA[i]]
                dp_sequence[i] = dp_sequence[j] + temp
                
indexOfMaximumValue = dp_length.index(max(dp_length))
print(dp_length[indexOfMaximumValue])
print(" ".join(map(str,dp_sequence[indexOfMaximumValue])))