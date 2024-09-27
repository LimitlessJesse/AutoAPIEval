import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.MouseEvent;

public class DropTargetAdapter_3 {
    public static void main(String[] args) {
        // Create a new DropTarget
        DropTarget dropTarget = new DropTarget(new MyDropTargetAdapter());
    }
}

class MyDropTargetAdapter extends DropTargetAdapter {
    @Override
    public void dragOver(DropTargetDragEvent dtde) {
        // Get the Transferable object
        Transferable t = dtde.getTransferable();

        // Check if the Transferable object is supported
        if (t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            // Set the action to copy
            dtde.acceptDrag(dtde.getDropAction());
        } else {
            // Set the action to none
            dtde.rejectDrag();
        }
    }
}
