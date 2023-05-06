//Practise Set 2

public class OverloadingDemo {
    void display() {
        System.out.println("Hello ");
    }

    void display(String str) {
        System.out.println("Hello " + str);
    }

    public static void main(String[] args) {
        OverloadingDemo dem = new OverloadingDemo();
        dem.display();
        dem.display("Manish");

    }
}
