import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTargetContext;

public class DropTargetContext_1 {
    public static void main(String[] args) {
        DropTargetContext dropTargetContext = new DropTargetContext();
        Transferable transferable = dropTargetContext.getTransferable();
        System.out.println("Transferable object: " + transferable);
    }
}
