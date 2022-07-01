package P2;
import P1.TwoDim;
public class ThreeDim extends TwoDim{
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
