import P1.TwoDim;
import P2.ThreeDim;

public class DyanamicDispatch {
    public static void main(String [] args){ TwoDim obj ;
    obj=new TwoDim(3,4);
    System.out.println(obj.toString());
    obj=new ThreeDim(3,4,5);
    System.out.println(obj.toString());
    }
}
