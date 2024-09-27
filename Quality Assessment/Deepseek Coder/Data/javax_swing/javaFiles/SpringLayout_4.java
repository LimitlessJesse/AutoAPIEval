import javax.swing.*;
import java.awt.*;

public class SpringLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        layout.putConstraint(SpringLayout.NORTH, button1, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, button2, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button2, 10, SpringLayout.WEST, panel);

        panel.add(button1);
        panel.add(button2);

        frame.add(panel);
        frame.setVisible(true);

        // Remove button1 from the layout
        layout.removeLayoutComponent(button1);

        // The button1 will no longer be displayed because it has been removed from the layout
        frame.repaint();
    }
}
