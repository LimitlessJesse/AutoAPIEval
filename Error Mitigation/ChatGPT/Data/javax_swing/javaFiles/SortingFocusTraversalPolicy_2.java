import javax.swing.SortingFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class SortingFocusTraversalPolicy_2 {
    public static void main(String[] args) {
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        Container container = new Container();
        Component component = new Component() {};
        
        Component componentBefore = policy.getComponentBefore(container, component);
        System.out.println("Component before: " + componentBefore);
    }
}
