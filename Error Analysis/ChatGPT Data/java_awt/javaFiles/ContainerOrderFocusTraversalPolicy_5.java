import java.awt.Component;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_5 {
    public static void main(String[] args) {
        ContainerOrderFocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy();
        Container container = new Container(); // Example container

        Component defaultComponent = policy.getDefaultComponent(container);
        
        System.out.println("Default Component: " + defaultComponent);
    }
}
