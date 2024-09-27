import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        JButton button1 = new JButton("Button 1");
        contentPane.add(button1);
        
        JButton button2 = new JButton("Button 2");
        contentPane.add(button2);
        
        ((FlowLayout) contentPane.getLayout()).setHgap(20); // Set horizontal gap
        
        frame.pack();
        frame.setVisible(true);
    }
}
