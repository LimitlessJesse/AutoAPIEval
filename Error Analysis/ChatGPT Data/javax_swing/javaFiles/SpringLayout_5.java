import javax.swing.*;
import javax.swing.SpringLayout;

public class SpringLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        
        // Add components to the container
        
        frame.pack();
        frame.setVisible(true);
    }
}
