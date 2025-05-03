n, m = map(int, input().split())

floor = [0]*10001

for player_num in range (1, m+1):
    left_hand, right_hand = map(int, input().split())
    floor[left_hand], floor[right_hand] = player_num, player_num
    
floor = list(filter(lambda x: x>0, floor))

print(floor[n%(2*m)-1])