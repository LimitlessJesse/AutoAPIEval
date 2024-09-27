import java.awt.Container;
import java.awt.event.ContainerEvent;

public class ContainerEvent_3 {
    public static void main(String[] args) {
        ContainerEvent event = new ContainerEvent(new Container(), ContainerEvent.COMPONENT_ADDED, new Object());
        Container container = event.getContainer();
        System.out.println("Originator of the event: " + container);
    }
}
