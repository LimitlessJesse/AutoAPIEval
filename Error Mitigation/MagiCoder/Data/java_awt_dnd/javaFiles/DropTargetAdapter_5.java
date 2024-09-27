import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;

public class DropTargetAdapter_5 {
    public static void main(String[] args) {
        DropTargetListener listener = new DropTargetAdapter() {
            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
                // Your code here
            }
        };

        DropTarget dropTarget = new DropTarget(null, listener);
    }
}
