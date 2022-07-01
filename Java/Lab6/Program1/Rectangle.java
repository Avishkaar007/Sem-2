package P2;
import P1.Shape;
public class Rectangle extends Shape{
    int length;
    int breadth;
    
    public Rectangle(){
        length=0;
        breadth=0;
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