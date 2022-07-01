package P3;


import P1.Shape;
public class Circle extends Shape{
    double radius;
    public Circle(){
        radius=0;
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