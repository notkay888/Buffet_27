import random
num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
count = int(input("How many random numbers would you like? "))
print("Your numbers are: ", end="")
for i in range(0, count-1):
    print(num[random.randrange(10)], end=", ")
print(num[random.randrange(10)])