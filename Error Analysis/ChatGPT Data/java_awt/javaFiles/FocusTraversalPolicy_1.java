import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;

public class FocusTraversalPolicy_1 {
    
    public static void main(String[] args) {
        // Example usage of getComponentAfter method
        Container container = new Container();
        Component component1 = new Component();
        Component component2 = new Component();
        
        // Implement your custom FocusTraversalPolicy
        FocusTraversalPolicy policy = new FocusTraversalPolicy() {
            @Override
            public Component getComponentAfter(Container aContainer, Component aComponent) {
                if (aComponent == component1) {
                    return component2;
                }
                return component1;
            }
            
            // Other overridden methods
            // ...
        };
        
        Component afterComponent = policy.getComponentAfter(container, component1);
        System.out.println("Component after component1: " + afterComponent);
    }
}
