package P1;
import java.util.Formatter;
public class TwoDim {
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
