

public class SuperSubReference {
    int i;
    public static void main(String [] args){
        SuperSubReference obj=new Son();
        System.out.println(obj.getClass());
    //We can see that following line will give error as,
    // refernce type is SuperSubReference type, and it don't know about Son's method.
    // But still object is of type Son
    //     System.out.println(obj.getString());
    }
}
class SubClass extends SuperSubReference{
    int x;
   String getString(){
    return "This is a demo string from Son.";
   }
}
