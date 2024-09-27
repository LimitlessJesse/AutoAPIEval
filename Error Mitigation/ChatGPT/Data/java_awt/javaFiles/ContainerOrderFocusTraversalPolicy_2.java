import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_2 {
    public static void main(String[] args) {
        Container focusCycleRoot = new Container(); // Create a focus cycle root container
        Component aComponent = new Component(); // Create a component
        
        // Create an instance of ContainerOrderFocusTraversalPolicy
        ContainerOrderFocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy();
        
        // Call the getComponentBefore method
        Component componentBefore = policy.getComponentBefore(focusCycleRoot, aComponent);
        
        // Print the result
        System.out.println("Component before: " + componentBefore);
    }
}
