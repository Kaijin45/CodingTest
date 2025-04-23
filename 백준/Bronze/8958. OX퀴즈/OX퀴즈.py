testcase = int(input())
for _ in range(testcase):
    correction = list(input())
    score = [0]*80
    for i in range(len(correction)):
        if correction[i] == 'O':
            score[i] = score[i-1] + 1
        
    print(sum(score))