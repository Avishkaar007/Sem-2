package P1;
import java.util.*;
public class TwoDim
{
    private int x;
    private int y;
    Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        x=0;
        y=0;
    }
    public TwoDim(int c1,int c2)
    {
        x=c1;
        y=c2;
    }
    public void Input()
    {
        System.out.print("Enter the x coordinate :");
        x=sc.nextInt();
        System.out.print("Enter the y coordinate :");
        y=sc.nextInt();
    }
    public String toString()
    {
        return("Coordinates:"+"\nx="+x+"\ny="+y);
    }
}