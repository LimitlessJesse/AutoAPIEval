import javax.swing.SortingFocusTraversalPolicy;
import java.awt.Container;
import java.awt.Component;

public class SortingFocusTraversalPolicy_5 {
    
    public static void main(String[] args) {
        // Create a SortingFocusTraversalPolicy object
        SortingFocusTraversalPolicy focusPolicy = new SortingFocusTraversalPolicy();
        
        // Create a Container object, for example a JFrame
        Container container = new JFrame();
        
        // Get the default component from the SortingFocusTraversalPolicy for the given container
        Component defaultComponent = focusPolicy.getDefaultComponent(container);
        
        // Print the default component (you can customize this part based on your use case)
        System.out.println("Default Component: " + defaultComponent);
    }
}
