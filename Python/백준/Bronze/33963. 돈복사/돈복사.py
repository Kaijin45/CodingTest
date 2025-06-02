money = int(input())
answer = 0
want = money

while True:
    want = money*2
    if len(str(want)) != len(str(money)):
        break
    else:
        answer += 1
        money = want
print(answer)