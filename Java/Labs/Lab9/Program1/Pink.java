import java.awt.*;
// import java.awt.event.*;

public class Pink extends Frame {
    Label l;

    Pink() {
        super("Pink Screen Example");
        l = new Label("Hello World");
        l.setBounds(25, 50, 250, 30);
        l.setAlignment(Label.CENTER);
        this.setBackground(Color.PINK);
        this.add(l);
        this.setSize(300, 400);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new Pink();

    }
}
