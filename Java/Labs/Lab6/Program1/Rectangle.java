package P2;
import P1.Shape;
import java.util.Scanner;
public class Rectangle extends Shape{
    double length;
    double breadth;
    
    public Rectangle(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length");
        length=sc.nextDouble();
        System.out.println("Enter Breadth");
        breadth=sc.nextDouble();
        shape="Rectangle";
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        shape="Rectangle";
    }
    public String getShape(){
        return shape;
    }
    public double getArea(){
        return length*breadth;
    }
}