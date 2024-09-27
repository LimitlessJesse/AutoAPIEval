import javax.swing.LayoutFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class LayoutFocusTraversalPolicy_4 {
    public static void main(String[] args) {
        LayoutFocusTraversalPolicy policy = new LayoutFocusTraversalPolicy();
        Container container = new Container(); // create a container
        Component lastComponent = policy.getLastComponent(container);
        System.out.println("Last Component: " + lastComponent);
    }
}
