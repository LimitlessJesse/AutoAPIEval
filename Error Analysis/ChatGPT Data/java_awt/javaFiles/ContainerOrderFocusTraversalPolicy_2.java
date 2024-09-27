import java.awt.Container;
import java.awt.Component;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_2 {
    public static void main(String[] args) {
        // Create a ContainerOrderFocusTraversalPolicy object
        ContainerOrderFocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy();

        // Create a Container object
        Container container = new Container();

        // Create two Component objects
        Component component1 = new Component();
        Component component2 = new Component();

        // Add the components to the container
        container.add(component1);
        container.add(component2);

        // Get the component before component2 in the container using getComponentBefore method
        Component beforeComponent = policy.getComponentBefore(container, component2);
        
        // Print out the result
        System.out.println(beforeComponent);
    }
}
