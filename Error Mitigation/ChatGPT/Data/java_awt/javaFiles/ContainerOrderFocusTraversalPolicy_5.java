import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_5 {
    public static void main(String[] args) {
        Container container = new Container(); // Create a Container object
        FocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy(); // Create a ContainerOrderFocusTraversalPolicy object
        Component firstComponent = policy.getFirstComponent(container); // Get the first Component in the traversal cycle
        System.out.println("First Component: " + firstComponent);
    }
}
