import java.awt.*;
import javax.swing.*;

public class FocusTraversalPolicy_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setLayout(null);

        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, 50, 100, 30);
        frame.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(50, 90, 100, 30);
        frame.add(button2);

        frame.setVisible(true);

        FocusTraversalPolicy policy = frame.getFocusTraversalPolicy();
        Component componentBefore = policy.getComponentBefore(frame, button2);

        System.out.println("Component before button2: " + componentBefore.getName());
    }
}
