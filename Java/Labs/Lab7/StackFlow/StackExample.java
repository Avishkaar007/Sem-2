import java.util.Scanner;
import java.lang.Exception;

class stackException extends Exception{
	public String overflow()
	{
		return ("Stack Overflow:Could not add more");
	}
	public String empty()
	{
		return ("Stack Underflow:No element in stack");
	}
}	

class StackD{
	int arr[];
	int t=-1;
	int size;
	Scanner sc=new Scanner(System.in);
	public StackD(int size){
		this.size=size;
		arr=new int[size];
	}
	
	public void push(int x) throws stackException{
		if(t==size-1){
			throw new stackException();
		}
		else
		{
			t++;
			arr[t]=x;
		}
	}
	
	public int pop() throws stackException{
		if(t==-1)  
		{
			throw new stackException();
		}
		else
		{
			return t--;
		}
	}
	public void Display(){
		int i;
		if(t==-1)
			System.out.println("Stack is Empty");
		for(i=t;i>=0;i--){
			System.out.println("Stack [" +i+"] = "+arr[i]+" ");
		}
	}
}
public class StackExample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int e, size;
		System.out.print("Enter the size of the Stack : ");
		size=sc.nextInt();
		StackD s=new StackD(size);
		int opt;
		do{
			System.out.print("\n1.Push\t2.Pop\t3.Display\nEnter The Choice : ");
			opt=sc.nextInt();
			switch(opt){
				case 1:
					try{
						System.out.print("\nEnter the Elements : ");
						e=sc.nextInt();
						s.push(e);
					}
					catch(stackException x){
						System.out.println(x.overflow());
					}
					break;
				case 2:
					try{
						s.pop();
					}
					catch(stackException x){
						System.out.println(x.empty());
					}
					break;
				case 3:
					s.Display();
					break;
				default:
					System.out.print("Wrong Choice");
					break;
			}
			
		}while(true );
	}		
}