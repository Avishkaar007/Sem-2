import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KbdAdapter extends KeyAdapter{

	JLabel l;
	
	KbdAdapter(JLabel l) {
		this.l = l;
	}

	public void keyTyped(KeyEvent e) {
		l.setText("Typed character is: " + e.getKeyChar());
	}

	public void keyPressed(KeyEvent e) {
		l.setText("Pressed character is: " + e.getKeyChar());
		System.out.println("Pressed character is: " + e.getKeyChar());
	}

	public void keyReleased(KeyEvent e) {
		l.setText("Released character is: " + e.getKeyChar());
		System.out.println("Released character is: " + e.getKeyChar());
	}
}

public class Main extends JFrame {
	JLabel l;
	Main(){
		super("AWT Keyboard");
		l = new JLabel("");
		l.setBounds(25, 50, 250, 30);
		
		this.addKeyListener(new KbdAdapter(l));  
		this.add(l);
		this.setSize(300, 110);
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		new Main();
	}
}