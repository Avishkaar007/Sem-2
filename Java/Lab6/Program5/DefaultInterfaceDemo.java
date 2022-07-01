public class DefaultInterfaceDemo implements Engine{
    
    public static void main(String [] args){
        Engine obj=new DefaultInterfaceDemo();
        System.out.println(obj.getcc());
    }
}
interface Engine{
    int cc=1200;
    default int getcc(){
        return cc;
    }
}

