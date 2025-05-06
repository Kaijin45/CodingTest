import sys
input = sys.stdin.readline

total_room, quest = map(int, input().split())
book_list = [0]*(total_room+1)
book_dict = {}
order = 0

def book_system(command, guest_order, guest_num, size):
    global book_list, book_dict, order
    if command == 'new':
        complete = False
        for i in range(1, total_room+2-size):
            okay = True
            for j in range(i, i+size):
                if book_list[j] != 0:
                    okay = False
                    break
            if okay:
                complete = True
                order += 1
                book_dict[order] = guest_num
                for j in range(i, i+size):
                    book_list[j] = order
                print(i, (i+size-1))
                break
        if not complete:
            print("REJECTED")
        
    if command == 'in':
        book_dict[guest_order] = book_dict.get(guest_order) + guest_num
        
    if command == 'out':
        if book_dict.get(guest_order) == guest_num:
            temp1 = book_list.index(guest_order)
            temp2 = total_room
            del book_dict[guest_order]
            for i in range(temp1, total_room+1):
                if book_list[i] == guest_order:
                    book_list[i] = 0
                else:
                    temp2 = i-1
                    break
            print("CLEAN %d %d" %(temp1, temp2))
        else:
            book_dict[guest_order] = book_dict.get(guest_order) - guest_num
            
for _ in range(quest):
    c, a, b = input().split()
    if c == 'new':
        book_system(c, 0, int(a), int(b))
    else:
        book_system(c, int(a), int(b), 0)