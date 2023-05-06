import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class driver extends JFrame implements ActionListener {
    JButton btnInfo, btnCGPA;
    driver() {
        super("Student Details");

        btnInfo = new JButton("A");
        btnInfo.setBounds(25, 125, 450, 100);
        btnInfo.addActionListener(this);
        this.add(btnInfo);

        btnCGPA = new JButton("B");
        btnCGPA.setBounds(25, 300, 450, 100);
        btnCGPA.addActionListener(this);
        this.add(btnCGPA);

        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnInfo) {
            new PersonalInfo("Mr . X","BSc(Hons) Chemsitry","AD-123456","ANDC College");
        }else{
            new CGPA("9.1");
        }
    }

    public static void main(String[] args) {
        new driver();
    }

}

class PersonalInfo extends JFrame{
    JButton btnClose;
    JPanel panelForm;
    JLabel labelName, labelCourse, labelRollNo, labelCollege;  // Labels
    JTextField fieldName, fieldCourse, fieldRollNo, fieldCollege;  // TextFields
    PersonalInfo(String name, String course, String rollNo, String college){
        super("Personal Information");
        labelName = new JLabel("Name:");
        labelName.setBounds(20, 20, 80, 30);
        labelCourse = new JLabel("Course:");
        labelCourse.setBounds(20, 50, 80, 30);
        labelRollNo = new JLabel("Roll No.:");
        labelRollNo.setBounds(20, 80, 80, 30);
        labelCollege = new JLabel("College:");
        labelCollege.setBounds(20, 110, 80, 30);
        fieldName = new JTextField(name);
        fieldName.setBounds(100, 22, 200, 24);
        fieldName.setEditable(false);
        fieldCourse = new JTextField(course);
        fieldCourse.setBounds(100, 52, 200, 24);
        fieldCourse.setEditable(false);
        fieldRollNo = new JTextField(rollNo);
        fieldRollNo.setBounds(100, 82, 200, 24);
        fieldRollNo.setEditable(false);
        fieldCollege = new JTextField(college);
        fieldCollege.setBounds(100, 112, 200, 24);
        fieldCollege.setEditable(false);
        btnClose = new JButton("Close");
        btnClose.setBounds(100, 150, 125, 30);
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        panelForm = new JPanel();
        panelForm.setLayout(null);
        panelForm.add(labelName);
        panelForm.add(fieldName);
        panelForm.add(labelCourse);
        panelForm.add(fieldCourse);
        panelForm.add(labelRollNo);
        panelForm.add(fieldRollNo);
        panelForm.add(labelCollege);
        panelForm.add(fieldCollege);
        panelForm.add(btnClose);
        this.add(panelForm);
        this.setSize(350, 250);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}