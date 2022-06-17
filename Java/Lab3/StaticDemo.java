
public class StaticDemo{

    public static int objCount=0;
    
    //Static Block
    static{System.out.println("This line is in static block");}
    
    StaticDemo(){
        objCount++;
    }
    static void lorem(){
        System.out.println("This is in a static method call.");
    }
    public static void main(String[] args){
        StaticDemo d1= new StaticDemo();
        StaticDemo d2= new StaticDemo();
        lorem();
        System.out.println("Number of Objects created :"+objCount);
        
    }
}
