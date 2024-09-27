import java.awt.Container;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class ContainerAdapter_2 {
    public static void main(String[] args) {
        Container container = new Container() {
            ContainerAdapter adapter = new ContainerAdapter() {
                @Override
                public void componentRemoved(ContainerEvent e) {
                    System.out.println("Component removed: " + e.getChild());
                }
            };

            @Override
            public void addNotify() {
                super.addNotify();
                addContainerListener(adapter);
            }

            @Override
            public void removeNotify() {
                super.removeNotify();
                removeContainerListener(adapter);
            }
        };

        container.add("Component1");
        container.remove("Component1");
    }
}
