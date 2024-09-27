import javax.swing.SortingFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class SortingFocusTraversalPolicy_4 {
    public static void main(String[] args) {
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        Container container = new Container(); // Example container
        Component lastComponent = policy.getLastComponent(container);
        System.out.println("Last Component: " + lastComponent);
    }
}
