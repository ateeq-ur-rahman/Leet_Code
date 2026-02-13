x=input("Enter a string of parentheses: ")

stack=[]

map={')':'(',
     '}':'{','[':']'}

for i in x:
    if i in map:
        t=stack.pop() if stack else '#'
        if map[i]!=t:
            print("False")
            exit()

    else:
        stack.append(i)
print(not(stack))