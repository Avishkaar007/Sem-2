//Practical Set 1
public class Mobile {
    String name;
    int price;
    String model;
     Mobile(){
        name="DummyName";
        price=0;
        model="Alpha";
    }
    Mobile(String name, int price,String model){
        this.name=name;
        this.price=price;
        this.model=model;
    }
    void setInfo(String name, int price,String model){
        this.name=name;
        this.price=price;
        this.model=model;
    }
    void show(){
        System.out.println("Name : "+name+"\nPrice : "+price+"\nModel : "+model+"\n");
    }

    public static void main(String [] args){
        Mobile m1=new Mobile();
        // 1- Using setter method
        m1.setInfo("Vivo",23000,"X23Pro");
        //2- Constructor with No Arguement
        Mobile m2=new Mobile();
        //3- Constructor with values
        Mobile m3=new Mobile("Samsung",17000,"M30");
        Mobile m4=new Mobile();
        //4- Setting values one by one
        m4.name="Iphone";
        m4.price=130000;
        m4.model="13Pro[256GB]";
        m1.show();
        m2.show();
        m3.show();
        m4.show();
    }
}

