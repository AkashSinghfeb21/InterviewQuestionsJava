def sum(a):
    
    x = []

    for i in range(1,101):

        x.append(i)

    for i in range(len(x)+1):

        a+=i 

    return a

x = 0

print(sum(x))    