import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;
import java.awt.dnd.TooManyListenersException;

public class DropTarget_1 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        DropTargetListener dropTargetListener = new DropTargetListener() {
            // Implement methods of DropTargetListener interface
        };
        
        try {
            dropTarget.addDropTargetListener(dropTargetListener);
        } catch (TooManyListenersException e) {
            e.printStackTrace();
        }
    }
}
