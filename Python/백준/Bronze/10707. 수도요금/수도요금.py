import sys
input = sys.stdin.readline

x_price = int(input().strip())
y_base_price = int(input().strip())
y_base_level = int(input().strip())
y_over_price = int(input().strip())
spend = int(input().strip())

x_pay = x_price * spend

if spend > y_base_level:
    y_pay = y_base_price + (spend - y_base_level) * y_over_price
else:
    y_pay = y_base_price
    
if x_pay > y_pay:
    print(y_pay)
else:
    print(x_pay)