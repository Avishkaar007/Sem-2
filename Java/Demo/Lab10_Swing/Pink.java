import javax.swing.*;
import java.awt.*;
public class Pink extends JFrame {
    JLabel l;

    Pink() {
        super("Pink Screen Example");
        l = new JLabel("Hello World");
        l.setBounds(25, 50, 250, 30);
       
        this.getContentPane().setBackground(Color.PINK);
        this.add(l);

        this.setSize(300, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Pink();

    }
}
