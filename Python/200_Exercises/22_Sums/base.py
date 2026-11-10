nu = int(input("Please enter a number: "))
sum = 0
for count in range(1, nu):
    print(count, end=" + ")
    sum = sum + count
print(nu)
sum = sum + nu
print("The sum is " + str(sum))
