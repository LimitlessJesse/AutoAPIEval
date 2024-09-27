import java.awt.datatransfer.*;

public class DropTargetDragEvent_4 {
    public static void main(String[] args) {
        DropTargetDragEvent event = new DropTargetDragEvent(null, null, 0, 0);
        Transferable transferable = event.getTransferable();
        System.out.println("Transferable: " + transferable);
    }
}
