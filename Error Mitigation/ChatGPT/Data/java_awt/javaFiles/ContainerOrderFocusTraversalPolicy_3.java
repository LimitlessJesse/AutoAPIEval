import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_3 {
    public static void main(String[] args) {
        Container container = new Container(); // Create a Container
        FocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy(); // Create a ContainerOrderFocusTraversalPolicy
        
        Component defaultComponent = policy.getDefaultComponent(container); // Get the default Component
        
        if(defaultComponent != null) {
            System.out.println("Default Component: " + defaultComponent.toString());
        } else {
            System.out.println("No suitable Component found.");
        }
    }
}
