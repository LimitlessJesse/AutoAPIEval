import java.awt.Component;
import java.awt.event.ContainerEvent;

public class ContainerEvent_4 {
    public static void main(String[] args) {
        ContainerEvent containerEvent = new ContainerEvent(new Component() {}, ContainerEvent.COMPONENT_ADDED, new Component() {});
        Component childComponent = containerEvent.getChild();
        System.out.println("Child Component: " + childComponent);
    }
}
