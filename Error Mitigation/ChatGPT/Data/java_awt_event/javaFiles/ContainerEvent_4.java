import java.awt.event.ContainerEvent;

public class ContainerEvent_4 {
    public static void main(String[] args) {
        ContainerEvent event = new ContainerEvent(new Object(), ContainerEvent.COMPONENT_ADDED, new Object());
        System.out.println(event.paramString());
    }
}
