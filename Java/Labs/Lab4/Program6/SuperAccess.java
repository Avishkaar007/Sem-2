//Program 6
public class SuperAccess {
    int a;
    int b;
    int getSum(){
        return a+b;
    }
    SuperAccess(){
        a=0;
        b=0;
    }
    SuperAccess(int a,int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String [] args){
        SubClass obj=new SubClass(10,5);
        obj.main();
        //Expected output 17
    }
}
class SubClass extends SuperAccess{
    int x;
    int y;
    SubClass(){
        x=0;
        y=0;    
    }
    void main(){
        
        System.out.println( super.getSum());
    }
    SubClass(int x,int y){
        super(x+1,y+1);
        //Calls Super with 1 incremented
        this.x=x;
        this.y=y;
    }
}
