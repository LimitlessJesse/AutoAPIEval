import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetContext;

public class DropTargetContext_4 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        DropTargetContext dropTargetContext = dropTarget.getDropTargetContext();
        System.out.println("DropTargetContext: " + dropTargetContext);
    }
}
