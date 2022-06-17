package P;
import P1.TwoDim;
import P2.ThreeDim;

public class Driver {
    public static void main(String [] args){
        TwoDim obj2d=new TwoDim(3,4);
        ThreeDim obj3d=new ThreeDim(3,4,5);
        System.out.println( obj2d.toString());

        System.out.println( obj3d.toString());
        TwoDim obj;
        obj=obj3d;
     System.out.println( obj.toString());
        obj=obj2d;
      System.out.println(  obj.toString());
    }
}

// javac -d . TwoDim.java
// javac -d . ThreeDim.java
// javac -d . Driver.java
// java Driver