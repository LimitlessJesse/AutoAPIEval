import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_4 {
    public static void main(String[] args) {
        Container container = new Container(); // Create a Container object
        FocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy(); // Create a ContainerOrderFocusTraversalPolicy object
        Component lastComponent = policy.getLastComponent(container); // Get the last Component in the traversal cycle
        System.out.println("Last Component: " + lastComponent);
    }
}
