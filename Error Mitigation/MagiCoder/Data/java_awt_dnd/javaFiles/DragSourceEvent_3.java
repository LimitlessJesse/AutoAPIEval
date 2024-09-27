import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;

public class DragSourceEvent_3 {
    public static void main(String[] args) {
        DragSource ds = new DragSource();
        ds.createDefaultDragGestureRecognizer(new DragSourceListener() {
            @Override
            public void dragEnter(DragSourceDragEvent dsde) {
                DragSourceContext dsc = dsde.getDragSourceContext();
                // Use dsc as needed...
            }

            @Override
            public void dragExit(DragSourceEvent dse) {
            }

            @Override
            public void dragOver(DragSourceDragEvent dsde) {
            }

            @Override
            public void dropActionChanged(DragSourceDragEvent dsde) {
            }

            @Override
            public void dragDropEnd(DragSourceDropEvent dsde) {
            }

            @Override
            public void dragGestureRecognized(DragGestureEvent dge) {
            }
        });
    }
}
