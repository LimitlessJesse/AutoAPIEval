import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DropTargetDragEvent;

public class DropTargetDragEvent_1 {
    public static void main(String[] args) {
        DropTargetDragEvent event = new DropTargetDragEvent(null, null, 0, 0);
        DataFlavor dataFlavor = DataFlavor.stringFlavor;
        boolean isSupported = event.isDataFlavorSupported(dataFlavor);
        System.out.println("Is DataFlavor Supported: " + isSupported);
    }
}
