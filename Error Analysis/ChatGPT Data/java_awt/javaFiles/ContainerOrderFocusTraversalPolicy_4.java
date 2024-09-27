import java.awt.Component;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_4 {
    public static void main(String[] args) {
        Container container = new Container();
        
        // Assuming container has been populated with components
        
        ContainerOrderFocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy();
        Component lastComponent = policy.getLastComponent(container);
        
        System.out.println("Last Component: " + lastComponent);
    }
}
