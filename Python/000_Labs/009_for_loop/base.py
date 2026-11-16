length = int(input("Please enter line length: "))
type = input("Do you want a horizontal or vertical line? (h/v): ")
if type == "h":
    for i in range(length):
        print("-", end="")
elif type == "v":
    for i in range(length):
        print("-")