import java.awt.dnd.DropTarget;
import java.awt.Component;

public class DropTarget_3 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        Component component = new Component() {};
        
        // Using setComponent method to set the Component
        dropTarget.setComponent(component);
        
        // Code continues here...
    }
}
