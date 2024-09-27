import java.awt.Component;
import java.awt.event.HierarchyEvent;

public class HierarchyEvent_2 {
    public static void main(String[] args) {
        // Create a new HierarchyEvent
        HierarchyEvent event = new HierarchyEvent(new Component(), HierarchyEvent.HIERARCHY_CHANGED);

        // Get the changed Component
        Component changedComponent = event.getChanged();

        // Print the changed Component
        System.out.println("Changed Component: " + changedComponent);
    }
}
