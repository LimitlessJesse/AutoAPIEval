import javax.swing.SortingFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class SortingFocusTraversalPolicy_1 {
    public static void main(String[] args) {
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        Container container = new Container();
        Component component = new Component() {};

        Component nextComponent = policy.getComponentAfter(container, component);
        System.out.println("Next component: " + nextComponent);
    }
}
