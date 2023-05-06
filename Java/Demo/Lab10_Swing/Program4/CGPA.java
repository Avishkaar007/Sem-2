
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CGPA extends JFrame{

    JLabel l;
    JButton btnClose;

    CGPA(String cgpa){
        super("Previous Year CGPA");

        l = new JLabel("Your CGPA was: " +cgpa);
        l.setBounds(10, 50, 280, 30);
        l.setHorizontalAlignment(SwingConstants.CENTER);
	l.setVerticalAlignment(SwingConstants.CENTER);

        btnClose = new JButton("Close");
        btnClose.setBounds(20, 85, 260, 30);

        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        this.add(l);
        this.add(btnClose);
        this.setSize(300, 150);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}