year = int(input("Please enter a year you'd like to check: "))
if year % 4 == 0:
    print(str(year) + " is a leap year.")
else:
    print(str(year) + " is not a leap year.")