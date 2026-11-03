nu = int(input("Please enter a number: "))
op = input("Please enter an operation: ")
nu2 = int(input("Please enter another number: "))
if op == "+":
    print(" ")
    print(str(nu) + (" + ") + str(nu2) + (" = ") + str(nu+nu2))
elif op == "-":
    print(" ")
    print(str(nu) + (" - ") + str(nu2) + (" = ") + str(nu-nu2))
elif op == "*":
    print(" ")
    print(str(nu) + (" * ") + str(nu2) + (" = ") + str(nu*nu2))
elif op == "/":
    print(" ")
    print(str(nu) + (" / ") + str(nu2) + (" = ") + str(nu/nu2))