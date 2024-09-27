import java.awt.*;
import javax.swing.*;

public class FocusTraversalPolicy_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLayout(null);

        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, 50, 100, 30);
        frame.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(50, 100, 100, 30);
        frame.add(button2);

        frame.setVisible(true);

        FocusTraversalPolicy policy = frame.getFocusTraversalPolicy();
        Component nextComponent = policy.getComponentAfter(frame, button1);

        System.out.println(nextComponent.getName());
    }
}
