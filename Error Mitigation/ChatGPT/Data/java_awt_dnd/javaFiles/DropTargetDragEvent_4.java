import java.awt.datatransfer.Transferable;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.DropTargetDragEvent;

public class DropTargetDragEvent_4 {
    public static void main(String[] args) {
        DropTargetDragEvent event = new DropTargetDragEvent(null);
        Transferable transferable = event.getTransferable();
        System.out.println("Transferable object: " + transferable);
    }
}
