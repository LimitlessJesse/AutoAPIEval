import javax.swing.*;
import java.awt.*;

public class LayoutFocusTraversalPolicy_2 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(); // create a JPanel for example
        Component component1 = new JButton("Button 1");
        Component component2 = new JButton("Button 2");

        panel.add(component1);
        panel.add(component2);

        LayoutFocusTraversalPolicy policy = new LayoutFocusTraversalPolicy() {
            @Override
            public Component getComponentAfter(Container focusCycleRoot, Component aComponent) {
                // custom implementation
                return super.getComponentAfter(focusCycleRoot, aComponent);
            }
        };

        Component nextComponent = policy.getComponentAfter(panel, component1);
        System.out.println("Next Component: " + nextComponent);
    }
}
