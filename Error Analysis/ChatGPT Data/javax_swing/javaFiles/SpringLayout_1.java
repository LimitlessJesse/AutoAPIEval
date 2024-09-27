import javax.swing.*;
import javax.swing.SpringLayout;

public class SpringLayout_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        
        JButton button = new JButton("Click Me");
        panel.add(button);
        
        SpringLayout.Constraints constraints = layout.getConstraints(button);
        
        constraints.setX(Spring.constant(10));
        constraints.setY(Spring.constant(10));
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
