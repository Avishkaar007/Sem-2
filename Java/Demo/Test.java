
import javax.swing.*;

public class Test  {
    public static void main(String [] args){
        JPanel jp=new JPanel();
        
        JFrame jf = new JFrame("Hfdfeufhe");
        JButton jb=new JButton("Btn");
        jf.setSize(600,300);
        JLabel jl= new JLabel("This is label");
        
        jf.add(jb);
        jb.setSize(100,200);
        jf.add(jl);
        jf.add(jp);
        jf.setSize(100,100);
        jf.setVisible(true);

    }
}
