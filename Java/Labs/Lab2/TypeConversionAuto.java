//Practise Set 3
public class TypeConversionAuto {

    void show(int a) {
        System.out.println(a);
    }

    void show(double a, int b) {
        System.out.println(a);

    }

    public static void main(String[] args) {
        TypeConversionAuto obj = new TypeConversionAuto();
        obj.show(88);
        obj.show(20, 1);// See this this int 20 converts to 20.0

    }
}
