import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Component;

public class BoxLayout_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        
        // Create a BoxLayout with Y_AXIS alignment
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(boxLayout);
        
        // Add components with constraints using addLayoutComponent method
        JButton button1 = new JButton("Button 1");
        frame.add(button1);
        frame.addLayoutComponent(button1, BoxLayout.X_AXIS);
        
        JButton button2 = new JButton("Button 2");
        frame.add(button2);
        frame.addLayoutComponent(button2, BoxLayout.Y_AXIS);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
