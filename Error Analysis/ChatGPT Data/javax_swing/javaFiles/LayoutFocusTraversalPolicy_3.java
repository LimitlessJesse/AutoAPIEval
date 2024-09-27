import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class LayoutFocusTraversalPolicy_3 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        panel.add(button1);
        panel.add(button2);
        
        Component firstComponent = LayoutFocusTraversalPolicy.getLayoutPolicy().getFirstComponent(panel);
        System.out.println("First component in focus cycle: " + firstComponent);
    }
}
