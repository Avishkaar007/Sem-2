//Practise 2
import java.util.Formatter;
class TwoDim {
    int x;
    int y;
    public TwoDim(){
        x=0;
        y=0;
        
    }
    public TwoDim(int x,int y){
        this.x=x;
        this.y=y;
        
    }
    public String toString(){
        Formatter f=new Formatter();
        String res =f.format(("%dx +%dy"),x,y).toString();
        return res;
    }
    
}


class ThreeDim extends TwoDim{
    int z;
    public ThreeDim(){
        z=0;
    }
    public ThreeDim(int x, int y,int z){
        super(x, y);
        this.z=z;
    }

    public String toString(){
        
        String res =super.toString()+"+"+z+"z";
        return res;
    }
}

public class DynamicDispatch {
    public static void main(String [] args){ 
        TwoDim obj ;
        obj=new TwoDim(3,4);
        System.out.println(obj.toString());
        obj=new ThreeDim(3,4,5);
        System.out.println(obj.toString());
    }
}
