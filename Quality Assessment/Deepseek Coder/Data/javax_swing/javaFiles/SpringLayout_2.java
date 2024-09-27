import javax.swing.*;
import java.awt.*;

public class SpringLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        JLabel label = new JLabel("Hello, World!");
        JButton button = new JButton("Click me");

        panel.add(label);
        panel.add(button);

        SpringLayout layout = (SpringLayout) panel.getLayout();
        layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.SOUTH, button, 5, SpringLayout.SOUTH, panel);
        layout.putConstraint(SpringLayout.EAST, button, 0, SpringLayout.EAST, panel);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
