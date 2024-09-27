import javax.swing.SortingFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class SortingFocusTraversalPolicy_3 {
    public static void main(String[] args) {
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        Container container = new Container(); // create a container
        Component firstComponent = policy.getFirstComponent(container);
        System.out.println("First Component: " + firstComponent);
    }
}
