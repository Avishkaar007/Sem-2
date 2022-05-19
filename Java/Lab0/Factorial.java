
//Practise Set 4
public class Factorial {
    public static void main(String [] args){
        int num=Integer.parseInt(args[0]);
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;  //fact = fact*i
        }
        System.out.println("Factorial of "+args[0]+" : "+fact);
    }
    
}
