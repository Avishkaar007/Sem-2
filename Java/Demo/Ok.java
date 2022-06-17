import java.util.Formatter;
import java.util.Formatter;
public class Ok {
public static void main(String[] args) {
    Formatter f=new Formatter();
    String res =f.format(("%dx +%dy"),10,20).toString();
    System.out.println(res);
}
}
