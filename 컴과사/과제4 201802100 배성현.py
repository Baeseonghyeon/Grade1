x = int(input("투입한 돈:"))
y = int(input("물건값:"))
g = x-y
print("거스름돈:",g)
z = g//500
print("500원 동전의 개수:",z)
w = (g%500)//100
print("100원 동전의 개수:",w)
