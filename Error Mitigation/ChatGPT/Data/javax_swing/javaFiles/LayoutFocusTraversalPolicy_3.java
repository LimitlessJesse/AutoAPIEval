import javax.swing.LayoutFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class LayoutFocusTraversalPolicy_3 {
    public static void main(String[] args) {
        LayoutFocusTraversalPolicy policy = new LayoutFocusTraversalPolicy();
        Container container = new Container(); // create a container
        Component firstComponent = policy.getFirstComponent(container);
        System.out.println("First Component: " + firstComponent);
    }
}
