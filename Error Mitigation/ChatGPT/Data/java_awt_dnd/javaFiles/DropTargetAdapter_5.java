import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetEvent;

public class DropTargetAdapter_5 {
    public static void main(String[] args) {
        // Create an instance of DropTargetAdapter
        DropTargetAdapter adapter = new DropTargetAdapter() {
            @Override
            public void dragExit(DropTargetEvent dte) {
                // Called while a drag operation is ongoing, when the mouse pointer has
                // exited the operable part of the drop site for the
                // DropTarget registered with this listener.
                System.out.println("Drag operation exited the drop site");
            }
        };
    }
}
