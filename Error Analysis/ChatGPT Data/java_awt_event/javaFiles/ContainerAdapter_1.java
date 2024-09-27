import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class MyContainerAdapter extends ContainerAdapter {
    
    @Override
    public void componentAdded(ContainerEvent e) {
        System.out.println("Component added to container");
    }

    public static void main(String[] args) {
        // Create a container and add components to it to trigger the componentAdded event
    }
}
