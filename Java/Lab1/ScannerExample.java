
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter your gender: ");
		char gender = scan.next().charAt(0);
		
		
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
		
		System.out.println("Enter your mobile no: : ");
		long mobileNo = scan.nextLong();
		
		System.out.println("Enter your CGPA: ");
		double cgpa = scan.nextDouble();
		
		System.out.println("Name: "+name +"\nGender:" +gender + "\nAge: "+age+"\nCGPA: "+cgpa);
	}
}