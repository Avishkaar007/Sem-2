//Practise Set 1 -Lab5
public class Multilevel {
    public static void main(String[] args) {
        XUV500 xuv500 = new XUV500();
        xuv500.model = " EX 1.5 ";
        xuv500.name = "XUV 500";
        System.out.println("You ordered " + xuv500.name + xuv500.model + "\nPrice = " + xuv500.price);
    }
}

class Vehicle {
    String name;
    String model;
}

class SUV extends Vehicle {
    int minWeight = 2000;
}

class XUV500 extends SUV {
    int price = 1_400_000;

}
