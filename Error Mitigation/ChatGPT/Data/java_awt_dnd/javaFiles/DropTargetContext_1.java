import java.awt.datatransfer.Transferable;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.DropTargetContext;

public class DropTargetContext_1 {
    public static void main(String[] args) {
        DropTargetContext dropTargetContext = new DropTargetContext();
        try {
            Transferable transferable = dropTargetContext.getTransferable();
            System.out.println("Transferable: " + transferable);
        } catch (InvalidDnDOperationException e) {
            System.out.println("InvalidDnDOperationException: " + e.getMessage());
        }
    }
}
