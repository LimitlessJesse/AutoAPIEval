import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDropEvent;
import java.io.IOException;

public class DropTargetDropEvent_2 {
    public static void main(String[] args) {
        // Create a DropTargetDropEvent object
        DropTargetDropEvent event = new DropTargetDropEvent(null, null, null, null, null, null, null);

        // Set the drop action
        event.setDropAction(DnDConstants.ACTION_COPY);

        // Get the drop action
        int dropAction = event.getDropAction();

        // Print the drop action
        System.out.println("Drop action: " + dropAction);
    }
}
