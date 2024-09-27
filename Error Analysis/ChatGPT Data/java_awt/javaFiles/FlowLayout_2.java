import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setLayout(new FlowLayout());
        
        FlowLayout layout = (FlowLayout) frame.getLayout();
        layout.setHgap(20); // Setting the horizontal gap to 20 pixels
        
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
