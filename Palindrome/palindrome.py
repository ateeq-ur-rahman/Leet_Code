x = int(input("Enter a number: "))
original = x
reversed_num = 0


while x > 0:
    digit = x % 10
    reversed_num = reversed_num * 10 + digit
    x //= 10


if original == reversed_num:
    print(f"{original} is a palindrome")
else:
    print(f"{original} is not a palindrome")



