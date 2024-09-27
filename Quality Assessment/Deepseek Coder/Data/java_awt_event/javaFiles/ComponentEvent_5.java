import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentEvent_5 {
    public static void main(String[] args) {
        Component component = new Component() {
            // Empty implementation
        };

        ComponentEvent event = new ComponentEvent(component, 0, 0, 0, 0, 0);
        Component componentFromEvent = event.getComponent();

        System.out.println(componentFromEvent);
    }
}
