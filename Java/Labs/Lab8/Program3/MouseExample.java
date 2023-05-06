// Write a program to handle mouse events(Clicked, Entered, Exited, Presses, and Released).
// Lab Exercise 8
import java.awt.*;  
import java.awt.event.*;  
public class MouseExample extends Frame implements MouseListener{  
    Label l;
    MouseExample(){  
        addMouseListener(this);
        l=new Label();  
        l.setBounds(20,50,100,20);
        add(l);
        setSize(1000,1000);  
        setLayout(null); 
        setVisible(true); 
    }
    
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseExample();  
}  
}  