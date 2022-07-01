
import java.util.Scanner;

//Practise Set 4
public class Factorial {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find factorial of ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;  //fact = fact*i
        }
        
        
        System.out.println("Factorial of "+num+" : "+fact);
    }
    
// }
// Enter number to find factorial of 
// 12
// Factorial of 12 : 479001600
