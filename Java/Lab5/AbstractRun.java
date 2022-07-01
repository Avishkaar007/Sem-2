

abstract class AbstractDemo {
    int x;
    int y;

   abstract void doFun();
   

}
public class AbstractRun extends AbstractDemo{
    public AbstractRun(){
        x=0;
        y=0;
    }
    public AbstractRun(int x , int y){
        this.x=x;
        this.y=y;
    }
    void doFun(){
        System.out.println("Doing fun ");
    }
    public String toString(){
        String res=x+"x+"+y+"y";
        return res;
       }
    public static void main(String[] args) {
        AbstractRun obj=new AbstractRun() ;
        obj.doFun();
        System.out.println( obj.toString());

    }
}