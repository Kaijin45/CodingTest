sumValue = int(input())
answer = 0

while True:
    if sumValue > answer:
        answer += 1
        sumValue -= answer
    else:
        print(answer)
        break