
public class SuperCallEg {
    int a;
    int b;
    SuperCallEg(){
        a=0;
        b=0;
    }
    SuperCallEg(int a,int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String [] args){
        SubClass obj=new SubClass(2,3);
        System.out.printf("a=%d b=%d x=%d y=%d",obj.a,obj.b,obj.x,obj.y);

    }
}
class SubClass extends SuperCallEg{
    int x;
    int y;
    SubClass(){
        super(0,0);
        x=0;
        y=0;    
    }
    SubClass(int x,int y){
        //Calls Super with 1 incremented
        super(x+1,y+1);
        this.x=x;
        this.y=y;
    }
}
