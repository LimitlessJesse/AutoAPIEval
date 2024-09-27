import java.awt.Container;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.JFrame;

public class ContainerEvent_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                Container container = (Container) e.getSource();
                System.out.println("Container: " + container);
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                // Not used in this example
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
