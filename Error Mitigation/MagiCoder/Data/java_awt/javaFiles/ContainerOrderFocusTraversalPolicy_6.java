import java.awt.Component;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_6 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component1 = new Component();
        Component component2 = new Component();
        Component component3 = new Component();

        container.add(component1);
        container.add(component2);
        container.add(component3);

        Component lastComponent = ContainerOrderFocusTraversalPolicy.getLastComponent(container);
        System.out.println(lastComponent);
    }
}
