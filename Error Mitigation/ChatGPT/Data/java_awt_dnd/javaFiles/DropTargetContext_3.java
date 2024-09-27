import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTarget;

public class DropTargetContext_3 {
    public static void main(String[] args) {
        DropTargetContext context = new DropTargetContext();
        DropTarget dropTarget = context.getDropTarget();
        System.out.println("DropTarget associated with this DropTargetContext: " + dropTarget);
    }
}
