import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;

public class DropTargetAdapter_3 extends DropTargetAdapter {

    public static void main(String[] args) {
        // Create a new DropTargetAdapter
        DropTargetAdapter_3 dropTargetAdapter = new DropTargetAdapter_3();

        // Add the adapter to a JComponent (or any other component that supports drop events)
        // component.addDropTargetListener(dropTargetAdapter);
    }

    @Override
    public void dragOver(DropTargetDragEvent dtde) {
        // Handle the event
        dtde.acceptDrag(DnDConstants.ACTION_COPY);
    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dtde) {
        // Handle the event
    }

    @Override
    public void drop(DropTargetDropEvent dtde) {
        // Handle the event
    }
}
