
//Program 2
// WAP to demonstrate Member Access and Inheritance 
public class MemberAccess {

    public static void main(String [] args){
        Human.main();
        Human.eatFood();
    }
}
class Human{
    public String name;
    protected static void eatFood(){
        System.out.println("Eating Food");
    }
    static void main(){
        System.out.println("This is Human:main");
        
    }
}
class Student extends Human{
    void study(){
        eatFood();
        System.out.println("Studying passionately ");
    }
}
