// Practise Set 5

/* Program to demonstrate the difference between public and private access control in java */

class PublicPrivateDemo {
    int a;
    public int b;
    private int c;

    void setc(int x) {
        c = x;
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Access y = new Access();
        y.a = 50;
        y.b = 10;
        y.setc(90);
        
        System.out.println("The value of :\na = " + y.a + "\nb = " + y.b + "\nc = " + y.getc());
       //Comment Next Line
        System.out.println("c = "+y.c);
    }
}