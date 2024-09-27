import javax.swing.SortingFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class SortingFocusTraversalPolicy_3 {
    public static void main(String[] args) {
        Container container = new Container(); // instantiate a Container object
        // instantiate a SortingFocusTraversalPolicy object
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        
        // get the first focus traversal component in the specified container
        Component firstComponent = policy.getFirstComponent(container);
        
        // print out the first focus traversal component
        System.out.println("First Component: " + firstComponent);
    }
}
