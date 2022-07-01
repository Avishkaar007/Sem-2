public class MultInterface {
    public static void main(String[] args) {
        College ref;
        ref=new CS();
        ref.show();
        ref=new Physics();
        ref.show(); 

    }

}
interface College{
    String name="ANDC";
    String address="Govindpuri,Delhi";
    void show();

}
class CS extends MultInterface implements College{
    String department="CS";
    public void show(){
        System.out.println("Department :"+department +" ,College :"+name);
    }
}
class Physics extends MultInterface implements College{
    String department="Physics";
    public void show(){
        System.out.println("Department :"+department +" ,College :"+name);
    }
}