from tkinter import *
from tkinter import ttk
import math
#Start
root=Tk()
root.configure(background='#7E8877')
root.title("Calculator")
expression=""
equation=StringVar()
#End
def clear():
    global expression
    expression = ""
    equation.set("")

def press(num):
   
    global expression
 
    expression = expression + str(num)
 
    # update the expression by using set method
    equation.set(expression)

def equalpress():
    try:
 
        global expression
        total = str(eval(expression))
        equation.set(total)
        expression=total
 
    except:
 
        equation.set(" error ")
        expression = ""
 
 


expr_root=Entry(root,textvariable=equation)
expr_root.grid(columnspan=5,ipadx=245,ipady=20)

def buttons():
    
    

    ttk.Button(root,text='7',command=lambda: press(7)).grid(column=0,row=5,ipadx=25,ipady=20)
    ttk.Button(root,text='8',command=lambda: press(8)).grid(column=1,row=5,ipadx=25,ipady=20)
    ttk.Button(root,text='9',command=lambda: press(9)).grid(column=2,row=5,ipadx=25,ipady=20)
    ttk.Button(root,text='x^y',command=lambda: press('**')).grid(column=3,row=5,ipadx=25,ipady=20)
    ttk.Button(root,text='-',command=lambda: press('-')).grid(column=4,row=5,ipadx=25,ipady=20)

    ttk.Button(root,text='4',command=lambda: press(4)).grid(column=0,row=6,ipadx=25,ipady=20)
    ttk.Button(root,text='5',command=lambda: press(5)).grid(column=1,row=6,ipadx=25,ipady=20)
    ttk.Button(root,text='6',command=lambda: press(6)).grid(column=2,row=6,ipadx=25,ipady=20)
    ttk.Button(root,text='*',command=lambda: press('*')).grid(column=3,row=6,ipadx=25,ipady=20)
    ttk.Button(root,text='/',command=lambda: press('/')).grid(column=4,row=6,ipadx=25,ipady=20)


    ttk.Button(root,text=')',command=lambda: press(')')).grid(column=4,row=7,ipadx=25,ipady=20)
    ttk.Button(root, text="1",command=lambda: press(1)).grid(column=0, row=7,ipadx=25,ipady=20)
    ttk.Button(root,text='2',command=lambda: press(2)).grid(column=1,row=7,ipadx=25,ipady=20)
    ttk.Button(root,text='3',command=lambda: press(3)).grid(column=2,row=7,ipadx=25,ipady=20)
    ttk.Button(root,text='(',command=lambda: press('(')).grid(column=3,row=7,ipadx=25,ipady=20)


    ttk.Button(root,text='=',command=equalpress).grid(column=4,row=8,ipadx=25,ipady=20)
    ttk.Button(root,text='+',command=lambda: press('+')).grid(column=3,row=8,ipadx=25,ipady=20)
    ttk.Button(root,text='0',command=lambda: press(0)).grid(column=2,row=8,ipadx=25,ipady=20)
    ttk.Button(root,text='.',command=lambda: press('.')).grid(column=1,row=8,ipadx=25,ipady=20)
    ttk.Button(root,text='Clear',command=lambda: clear()).grid(column=0,row=8,ipadx=25,ipady=20)


buttons()
root.mainloop()