import javax.swing.LayoutFocusTraversalPolicy;
import java.awt.Component;
import java.awt.Container;

public class LayoutFocusTraversalPolicy_1 {
    public static void main(String[] args) {
        LayoutFocusTraversalPolicy policy = new LayoutFocusTraversalPolicy();
        Container container = new Container();
        Component component = new Component() {};
        
        Component nextComponent = policy.getComponentAfter(container, component);
        System.out.println("Next component: " + nextComponent);
    }
}
