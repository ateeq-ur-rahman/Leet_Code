# x = int(input("Enter a number: "))
# original = x
# reversed_num = 0


# while x > 0:
#     digit = x % 10
#     reversed_num = reversed_num * 10 + digit
#     x //= 10


# if original == reversed_num:
#     print(f"{original} is a palindrome")
# else:
#     print(f"{original} is not a palindrome")



# x=int(input())
# og=x
# r=0

# while(x>0):
#     d=x%10
#     r=r*10+d
#     x=x//10

# if og==r:
#     print("True")
# else:
#     print("False")

#Program for String Palindrome without slicing

# s=input()
# og=s
# r=""
# for i in s:
#     r=i+r
# if og==r:
#     print("True")
# else:

#     print("False")


#Reverse a string without slicing
s=input()
r=""
for i in s:
    r=i+r
print(r)