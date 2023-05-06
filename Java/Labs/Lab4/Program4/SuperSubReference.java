//Program 4 -Lab4

public class SuperSubReference {
    int i;
    public static void main(String [] args){
        SuperSubReference obj=new SubClass();
        System.out.println(obj.getClass());
    //We can see that following line will give error as,
    // refernce type is SuperSubReference type, and it don't know about SubClass method.
    // But still object is of type SubClass
       // System.out.println(obj.getString());
    }
}
class SubClass extends SuperSubReference{
    int x;
   String getString(){
    return "This is a demo string from SubClass.";
   }
}
