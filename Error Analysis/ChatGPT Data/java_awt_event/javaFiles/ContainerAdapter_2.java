import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class ContainerAdapter_2 {
    public static void main(String[] args) {
        MyContainerListener containerListener = new MyContainerListener();
        containerListener.componentRemoved(new ContainerEvent(new Container(), ContainerEvent.COMPONENT_REMOVED, new Object()));
    }

    static class MyContainerListener extends ContainerAdapter {
        @Override
        public void componentRemoved(ContainerEvent e) {
            System.out.println("Component removed from container");
        }
    }

    static class Container {}
}
