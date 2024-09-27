import java.awt.Component;
import java.awt.dnd.DropTargetContext;

public class DropTargetContext_2 {
    public static void main(String[] args) {
        DropTargetContext dropTargetContext = new DropTargetContext();
        Component component = dropTargetContext.getComponent();
        System.out.println("Component associated with this DropTargetContext: " + component);
    }
}
