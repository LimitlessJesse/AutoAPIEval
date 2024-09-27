import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentAdapter_3 {

    public static void main(String[] args) {
        // Create a new component adapter
        ComponentAdapter adapter = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Component Resized: " + e.getComponent());
                // Add your custom resizing logic here
            }
        };

        // Example of adding the component adapter to a component (e.g., JFrame)
        // component.addComponentListener(adapter);
    }
}
