def factorial(a):
    if a == 0:
        return 1
    if a == 1:
        return 1
    else:
        return a*factorial(a-1)

n = int(input())

print(factorial(n))