def pow(a):
    if(a==1 or a==0):
        return 1
    
    for i in range(1,3+1):
        a+=i

    return a 

#2 3 1 3 * ^^ pow

print(pow(1))   