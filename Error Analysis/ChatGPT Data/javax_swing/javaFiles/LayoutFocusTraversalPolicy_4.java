import javax.swing.*;
import java.awt.*;

public class LayoutFocusTraversalPolicy_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        Component lastComponent = getLastComponent(panel);
        System.out.println("Last Component: " + lastComponent);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static Component getLastComponent(Container focusCycleRoot) {
        LayoutFocusTraversalPolicy policy = new LayoutFocusTraversalPolicy();
        Component lastComponent = policy.getLastComponent(focusCycleRoot);
        return lastComponent;
    }
}
