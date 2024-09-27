import java.awt.event.ContainerEvent;
import java.awt.event.ContainerAdapter;
import java.awt.Container;

public class ContainerAdapter_1 extends ContainerAdapter {
    public static void main(String[] args) {
        Container container = new Container();
        container.addContainerListener(new ContainerAdapter_1());
        container.add("Hello");
    }

    @Override
    public void componentAdded(ContainerEvent e) {
        System.out.println("Component added: " + e.getChild());
    }
}
