import P1.Shape;
import P2.Rectangle;
import P3.Circle;
import java.util.Scanner;
public class Driver1{
    public static void main(String [] args){
        Shape s1;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("1: Rectangle , 2 Circle");
        int op= scan.nextInt();
        choice:{
            switch (op){
                case 1:{
                    s1=new Rectangle();
                    System.out.println(s1.getArea());
                    break;
                }
                case 2:{
                    s1=new Circle();
                    System.out.println(s1.getArea());
                    break;
                }
            }
        } 
        
    }
}