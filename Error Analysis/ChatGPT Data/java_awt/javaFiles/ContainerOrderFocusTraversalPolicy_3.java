import java.awt.Component;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_3 {
    public static void main(String[] args) {
        ContainerOrderFocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy();

        Container container = new Container(); // Example container
        Component firstComponent = policy.getFirstComponent(container);
        System.out.println("First Component: " + firstComponent);
    }
}
