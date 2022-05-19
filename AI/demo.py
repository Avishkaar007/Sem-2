# Inputting list


#lst=eval(input("Enter list"))

# print(lst)

# sz=int(input("Enter number of elements in list: "))
# for a in range(sz):
    
#     num=int(input())
#     lst.append(num)
# print(lst)




#Adding list

# lst1=eval(input("Enter list 1 "))
# lst2=eval(input("Enter list 2 "))
# lst3=lst1+lst2
# print("lst3 (lst1+lst2)= ",lst3)
# print(len(lst1)," ",len(lst2)," ",len(lst2))
# for a in range(0,(len(lst1)+len(lst2))):
#     if (((lst3[a])%2)!=0):
#         lst3.pop(a)
        
# print("List with removed odd elements = ",lst3)



# print("Sliced list lst3 : ",lst3[3:8])

# lst1.extend(lst2)

# print("Extended lst1 =",lst1)
#  # Finding elements

# Colors
lst=['red','yellow','green','cyan']
def menu():

    print(" 1: Add Color  , 2: Remove\n 3: Search  , 4:Sort")
    op=int(input("Enter your choice : "))

    if (op==1):
        col=input("color : ")
        lst.append(col)
    if (op==2):
        col=input("color : ")
        lst.remove(col)
    
    if (op==3):
        col=input("color : ")
        for a in lst:
            if a==col:
                print("Found at ",lst.index(a))
   
    if (op==4):
        lst.sort()
        print(lst)

menu()
print(lst)