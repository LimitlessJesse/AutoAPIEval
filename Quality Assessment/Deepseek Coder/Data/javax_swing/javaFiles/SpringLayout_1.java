import javax.swing.*;
import java.awt.*;

public class SpringLayout_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        layout.putConstraint(SpringLayout.NORTH, button1, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.SOUTH, button2, 5, SpringLayout.SOUTH, panel);
        layout.putConstraint(SpringLayout.EAST, button2, 5, SpringLayout.EAST, panel);

        layout.addLayoutComponent(button1, "Button 1");
        layout.addLayoutComponent(button2, "Button 2");

        panel.add(button1);
        panel.add(button2);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
