import sys
input = sys.stdin.readline

num = int(input())
Tree = []
for i in range(num):
    a, b, c = input().split()
    t = [a, [b, c]]
    Tree.append(t)

Tree.sort()

# 전위 순회
def preorder(alphabet):
    order = ord(alphabet) - ord('A')
    print(alphabet, end="")
    if Tree[order][1][0] != '.':
        preorder(Tree[order][1][0])
    if Tree[order][1][1] != '.':
        preorder(Tree[order][1][1])

# 중위 순회
def inorder(alphabet):
    order = ord(alphabet) - ord('A')
    if Tree[order][1][0] != '.':
        inorder(Tree[order][1][0])
    print(alphabet, end="")
    if Tree[order][1][1] != '.':
        inorder(Tree[order][1][1])
        
def postorder(alphabet):
    order = ord(alphabet) - ord('A')
    if Tree[order][1][0] != '.':
        postorder(Tree[order][1][0])
    if Tree[order][1][1] != '.':
        postorder(Tree[order][1][1])
    print(alphabet, end="")
    
preorder("A")
print()
inorder("A")
print()
postorder("A")