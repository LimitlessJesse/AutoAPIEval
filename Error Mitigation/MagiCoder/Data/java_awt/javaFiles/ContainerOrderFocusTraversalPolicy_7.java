import java.awt.Component;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_7 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component1 = new Component();
        Component component2 = new Component();
        container.add(component1);
        container.add(component2);

        ContainerOrderFocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy();
        Component defaultComponent = policy.getDefaultComponent(container);

        System.out.println("Default Component: " + defaultComponent);
    }
}
