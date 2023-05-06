
import java.util.Scanner;
class UnderAge extends Exception{
    int age;
    UnderAge(int age){
        this.age=age;
    }
    public String toString(){
        String temp="Under Age: "+age;
        return temp;
    }
}
public class UnderAgeDemo{
	static void test(int age){
      	try {
			if (age<18){
            		throw new UnderAge(age);
            	}
			else{
				System.out.println("age is above 18");
			}
      	}
      	catch (UnderAge a){
            	System.out.println(a.toString());
      	}
    	}
	public static void main(String []args ){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		test(age);
	}
}