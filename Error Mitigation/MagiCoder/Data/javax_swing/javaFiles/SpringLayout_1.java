import javax.swing.*;
import java.awt.*;

public class SpringLayout_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button = new JButton("Button");
        panel.add(button);

        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        layout.putConstraint(SpringLayout.WEST, button, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, button, 50, SpringLayout.NORTH, panel);

        frame.setVisible(true);
    }
}
