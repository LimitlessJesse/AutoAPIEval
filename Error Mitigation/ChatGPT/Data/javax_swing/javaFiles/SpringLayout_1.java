import javax.swing.*;

public class SpringLayout_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        panel.add(button1);
        panel.add(button2);
        
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, button1, 10, SpringLayout.NORTH, panel);
        
        layout.putConstraint(SpringLayout.WEST, button2, 10, SpringLayout.EAST, button1);
        layout.putConstraint(SpringLayout.NORTH, button2, 0, SpringLayout.NORTH, button1);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
