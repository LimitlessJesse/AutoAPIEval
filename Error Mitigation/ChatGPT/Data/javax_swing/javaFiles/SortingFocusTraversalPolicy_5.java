import javax.swing.SortingFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class SortingFocusTraversalPolicy_5 {
    public static void main(String[] args) {
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        Container container = new Container(); // create a container for testing
        Component defaultComponent = policy.getDefaultComponent(container);
        System.out.println("Default Component: " + defaultComponent);
    }
}
