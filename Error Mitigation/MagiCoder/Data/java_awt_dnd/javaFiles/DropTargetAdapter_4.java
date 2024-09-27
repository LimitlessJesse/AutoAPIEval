import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.event.MouseEvent;

public class DropTargetAdapter_4 {
    public static void main(String[] args) {
        // Create a DropTarget
        DropTarget dropTarget = new DropTarget(new MyDropTargetAdapter());
    }
}

class MyDropTargetAdapter extends DropTargetAdapter {
    @Override
    public void dragExit(DropTargetEvent dtEvent) {
        // Your code here
    }
}
