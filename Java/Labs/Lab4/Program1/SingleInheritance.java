
//Program 1
class Father {
    String name;
    String surname;
}
public class SingleInheritance {
    int j;
    static void printRelation(Son son, Father dad){
        System.out.println("Child no "+son.childNO+" of "+dad.name+dad.surname +" is "+son.name+" "+son.surname);
    }
public static void main(String [] args){
    Son child1=new Son();
    child1.name="Rahul";
    child1.surname="Sharma";
    child1.childNO=1;

    Father dad=new Father();
    dad.name="Ramprasad ";
    dad.surname="Sharma";
    printRelation(child1,dad );
    
    
}
}
class Son extends Father{
    String name;
    int childNO;
}
