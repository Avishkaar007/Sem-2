import java.awt.*;
import java.awt.event.*; 
 public class Main extends Frame implements ActionListener {
    Button btnA, btnB;
    Label la,lb;
    Main() {
        super("Student Data");
        la=new Label("Name:James, Course :B.A. , Roll No : 1234 , College : Alien College ");
        lb= new Label("CGPA : 7.4");
        la.setBounds(25,250 ,1000,100);
        lb.setBounds(25,350,100,100);

        btnA = new Button("A");
        btnA.setBounds(25, 50, 100, 100); 
        btnA.addActionListener(this);
        this.add(btnA);
        
        btnB = new Button("B");
        btnB.setBounds(25, 150, 100, 100);
        btnB.addActionListener(this);        
        this.add(btnB);

        this.setSize(500, 500); 
        this.setLayout(null); 
       
       
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                 dispose(); 
            } 
        });
        this.setVisible(true); 
    } 
    public static void main(String[] args) {
                 new Main(); 
    }
    @Override public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == btnA) { this.add(la); }
        else if (e.getSource() == btnB) { 
            this.add(lb);
            //this.setVisible(true); 
        } 
    }
}
