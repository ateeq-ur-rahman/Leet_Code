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
# s=input()
# r=""
# for i in s:
#     r=i+r
# print(r)

#Two Sum

# a=list(map(int,input().split()))
# target=int(input())
# d={}

# for i,num in enumerate(a):
#     complement=target-num
#     if complement in d:
#         print([d[complement],i])
#         break
#     d[num]=i

# for k,l in enumerate(a):
#     print(k,l)


#Kadane Algorithm

# a=list(map(int,input().split()))
# max_sum=float('-inf')
# cs=0
# for i in a:
#     cs=cs+i
#     max_sum=max(max_sum,cs)
#     if cs<0:
#         cs=0
# print(max_sum)

# a=list(map(int,input().split()))
# cs=a[0]
# mx=a[0]

# for i in range(1,len(a)):
#     cs=max(a[i],cs+a[i])
#     mx=max(mx,cs)
# print(mx)

# n=int(input())
# a=0
# b=1

# for i in range(n):
#     c=a+b
#     print(c,end=" ")
#     a=b
#     b=c


#Print all possible sub arrays of an array optimized

# a=list(map(int,input().split()))
# for i in range(len(a)):
#     for j in range(i,len(a)):
#         print(a[i:j+1])


# a=list(map(int,input().split()))
# tg=int(input())

# for i in range(len(a)):
#     cs=0
#     for j in range(i,len(a)):
#         cs=cs+a[j]
#         if cs==tg:
#             print(a[i:j+1])


# a=list(map(int,input().split()))
# tg=int(input())

# for i in range(len(a)):
#     cs=0
#     for j in range(i,len(a)):
#         cs=cs+a[j]
# #         if cs==tg:
# #             print(a[i:j+1])

# a=list(map(int,input().split()))
# tg=int(input())
# cs=0
# s=0

# for i in range(len(a)):
#     cs=cs+a[i]

#     while cs>tg:
#         cs-=a[s]
#         s+=1
#     if cs==tg:
#         print(a[s:i+1])


# a=list(map(int,input().split()))
# tg=int(input())

# for i in range(len(a)):
#     s=0
#     for j in range(i,len(a)):
#         s=s+a[j]
#         print(s)

# a=list(map(int,input().split()))
# tg=int(input())
# cs=0
# s=0
# m=0
# for i in range(len(a)):
#     cs=cs+a[i]
#     while cs>tg:
#         cs=cs-a[i]
#         s+=1
#     if cs==tg:
#         m=max(m,i-s+1)
# print(m)

a=list(map(int,input().split()))
s=a[0]
cs=a[0]

for i in range(1,len(a)):
    cs=max(a[i],cs+a[i])
    s=max(s,cs)
print(s)