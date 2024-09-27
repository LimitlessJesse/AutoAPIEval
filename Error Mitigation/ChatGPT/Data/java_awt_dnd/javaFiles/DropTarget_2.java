import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;

public class DropTarget_2 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        DropTargetListener dropTargetListener = new DropTargetListener() {
            // Implement DropTargetListener methods here
        };
        
        dropTarget.removeDropTargetListener(dropTargetListener);
    }
}
