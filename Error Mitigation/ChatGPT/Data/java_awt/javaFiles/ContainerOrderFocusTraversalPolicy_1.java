import java.awt.Component;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;

public class ContainerOrderFocusTraversalPolicy_1 {
    public static void main(String[] args) {
        ContainerOrderFocusTraversalPolicy policy = new ContainerOrderFocusTraversalPolicy();
        Container focusCycleRoot = new Container();
        Component aComponent = new Component();

        Component nextComponent = policy.getComponentAfter(focusCycleRoot, aComponent);
        System.out.println("Next component to focus: " + nextComponent);
    }
}
