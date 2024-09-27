import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTarget;
import java.awt.Component;

public class DropTargetContext_3 {
    public static void main(String[] args) {
        // Create a DropTargetContext object
        DropTargetContext dropTargetContext = new DropTargetContext();

        // Get the Component associated with the DropTargetContext
        Component component = dropTargetContext.getComponent();
        
        // Print the Component
        System.out.println("Component: " + component);
    }
}
