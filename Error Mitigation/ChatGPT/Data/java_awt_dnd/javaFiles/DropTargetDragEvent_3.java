import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DropTargetDragEvent;

public class DropTargetDragEvent_3 {
    public static void main(String[] args) {
        DropTargetDragEvent event = new DropTargetDragEvent(null);
        DataFlavor[] dataFlavors = event.getCurrentDataFlavors();
        for (DataFlavor flavor : dataFlavors) {
            System.out.println(flavor);
        }
    }
}
