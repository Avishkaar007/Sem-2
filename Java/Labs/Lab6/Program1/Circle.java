package P3;
import java.util.Scanner;
import P1.Shape;
public class Circle extends Shape{
    double radius;
    public Circle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of circle");
        radius = sc.nextDouble();
        
    }
    
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return (3.14159*radius*radius);
    }
     public String getShape(){
        return shape;
    }

    
}