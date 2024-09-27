import java.awt.Component;
import java.awt.Container;
import java.awt.DefaultFocusTraversalPolicy;
import java.awt.FocusTraversalPolicy;

public class FocusTraversalPolicy_3 {
    public static void main(String[] args) {
        // Create a sample container
        Container container = new Container();
        
        // Get the default focus traversal policy for the container
        FocusTraversalPolicy policy = new DefaultFocusTraversalPolicy();
        
        // Get the default component for the container
        Component defaultComponent = policy.getDefaultComponent(container);
        
        System.out.println("Default Component: " + defaultComponent);
    }
}
