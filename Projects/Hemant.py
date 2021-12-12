#check if a number is prime
def prime():
    num=int(input("Enter the number : "))
    count=0
    for i in range(1,num+1):
        if num%i==0:
            count +=1
        else:
            continue
    if count==2:
        print(num, "is a prime number!")
    else:
        print(num, "is not a prime number!")
prime()
