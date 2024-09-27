import java.awt.Component;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_4 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component1 = new Component();
        Component component2 = new Component();

        container.add(component1);
        container.add(component2);

        Component beforeComponent = ContainerOrderFocusTraversalPolicy.getComponentBefore(container, component2);
        System.out.println(beforeComponent);
    }
}
