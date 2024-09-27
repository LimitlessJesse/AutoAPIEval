import java.awt.Component;
import java.awt.event.ContainerEvent;

public class ContainerEvent_1 {
    public static void main(String[] args) {
        Component component = new Component() {};
        ContainerEvent event = new ContainerEvent(component, ContainerEvent.COMPONENT_ADDED, component);
        
        Component affectedComponent = event.getChild();
        System.out.println("Affected Component: " + affectedComponent);
    }
}
