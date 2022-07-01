public class InterfaceDemo implements MyMath{

   public void doFun(){
        System.out.println("Doing fun");
    }
    public static void main(String[] args){
        System.out.println(MyMath.PI);
        InterfaceDemo obj=new InterfaceDemo();
        obj.doFun();
    }


}
interface MyMath{
    double PI=3.14159;
    double e=2.71828;
    void doFun();
    default double sq(double x){
        return x*x;
    }
}