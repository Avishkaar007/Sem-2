def calculator():
   while(True):
    
    num1=float(input("Enter number 1 :"))
    num2=float(input("Enter number 2 :"))
    inp=int(input("1: Add , 2: Subtraction , 3: Multiply , 4: Divide :  "))
    if (inp == 1) :
        print("addition of two num is ",num1+num2)
    elif (inp == 2) :
        print("subtraction of two num is ", num1-num2)
    elif (inp == 3) :
        print("multiplication of two num is",num1*num2)
    elif (inp == 4) :
        print("division of two num is ",num1/num2)
    else :
        print("No such operation , Retry")
        


        
calculator()