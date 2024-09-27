import java.awt.*;
import javax.swing.*;

public class FocusTraversalPolicy_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FocusTraversalPolicy Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        FocusTraversalPolicy policy = new LayoutFocusTraversalPolicy(); // Create a new focus traversal policy

        Component firstComponent = policy.getFirstComponent(container);

        System.out.println("First component in focus traversal: " + firstComponent);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
