public class BranchingInheritance {
    public static void main(String [] args){
        Son son= new Son();
        Daughter beti=new Daughter();
        System.out.println("Son have moustache "+son.moustache);
        System.out.println( "Daughter have moustache "+beti.moustache);
    }   
}
class Father{
    String surname;
    boolean moustache=true;
}
class Son extends Father{
    boolean moustache=true;

}
class Daughter extends Father {
    boolean moustache=false;
}
