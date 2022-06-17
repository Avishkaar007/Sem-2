//Lab Exercise No 1
public class ComplexNum {
    float real,imag;
    //constructors 
    ComplexNum(){
        this.real = 0;
        this.imag = 0;
    }
    ComplexNum (float x, float y){
        this.real=x;
        this.imag=y;
    }
  
    public ComplexNum add( ComplexNum c2){
        ComplexNum c= new ComplexNum();
        c.real = this.real + c2.real;
        c.imag=this.imag+c2.imag;
        return c;
    }
    public ComplexNum mult(ComplexNum c2){
        ComplexNum c= new ComplexNum();
        c.real=(this.real)*(c2.real)-(this.imag)*(c2.imag);
        c.imag=(this.real)*(c2.imag)+ (this.imag)*(c2.real);
        return c;
    }
    public void ToString(){
        System.out.print("ComplexNum number is : ");
        System.out.println(this.real + " + "+ this.imag +"i");
    }


    public static void main(String[] args){
        ComplexNum c1=new ComplexNum(3,4);
        
        c1.ToString();
        ComplexNum c2=new ComplexNum(2,3);
        c2.ToString();
        ComplexNum sum1=new ComplexNum();
        sum1=c1.add(c2);
        System.out.print("Sum of ");
        sum1.ToString();
        ComplexNum prod=new ComplexNum();
        prod=c1.mult(c2);
        System.out.print("Product of ");
        prod.ToString();
        
    }

}
