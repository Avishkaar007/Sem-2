import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class BlueRed extends JFrame implements ActionListener {
    JButton btnRed, btnBlue;
    BlueRed() {
        super("AWT Buttons");
        btnRed = new JButton("Red");
        btnRed.setBounds(25, 50, 250, 30); 
        btnRed.addActionListener(this);
        this.add(btnRed);
        btnBlue = new JButton("Blue");
        btnBlue.setBounds(25, 100, 250, 30);
        btnBlue.addActionListener(this);
        this.add(btnBlue);
        this.setSize(300, 160); 
        this.setLayout(null); 
        this.setVisible(true); 
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                 dispose(); 
            }
        });
        
    } 
    public static void main(String[] args) {
                 new BlueRed(); 
    }
    @Override public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == btnRed) { this.getContentPane().setBackground(Color.RED); }
        else if (e.getSource() == btnBlue) { this.getContentPane().setBackground(Color.BLUE); } 
    }
}
