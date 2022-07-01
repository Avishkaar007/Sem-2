
public class ExtendInterfaceDemo implements Car {
    public static void main(String [] args){
        Car obj=new ExtendInterfaceDemo();
        System.out.println( obj.getColor());
        System.out.println(obj.getcc());
        System.out.println(obj.getTyreCount());
    };
}

interface Body {
    String paint_color="Black";
    default String getColor(){
        return paint_color;
    }
}
interface Engine{
    int cc=1200;
    default int getcc(){
        return cc;
    }
}

interface Car extends Body,Engine{
 int tyre_count=4;
 default int getTyreCount(){
    return tyre_count;
 }

}