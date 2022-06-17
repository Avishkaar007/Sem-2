
//Program 2
// WAP to demonstrate Member Access and Inheritance 
public class MemberAccess {

    public static void main(String [] args){
        Human.main();
    }
}
class Human{
    public String name;
    protected void eatFood(){
        System.out.println("Eating Food");
    }
    static void main(){
        System.out.println("D");
    }
}
class Student extends Human{
    void study(){
        System.out.println("Studying passionately ");
    }
}
