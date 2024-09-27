import javax.swing.SortingFocusTraversalPolicy;
import java.awt.*;

public class SortingFocusTraversalPolicy_1 {
    public static void main(String[] args) {
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();

        Container container = new Container();
        Component component1 = new Component() {};
        Component component2 = new Component() {};
        Component component3 = new Component() {};

        container.add(component1);
        container.add(component2);
        container.add(component3);

        Component nextComponent = policy.getComponentAfter(container, component2);
        System.out.println("Next Component after component2: " + nextComponent);
    }
}
