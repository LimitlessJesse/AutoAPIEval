import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;

public class DragSourceDropEvent_3 {
    public static void main(String[] args) {
        DragSource source = new DragSource();
        source.createDefaultDragGestureRecognizer(new DragSourceListener() {
            @Override
            public void dragEnter(DragSourceDragEvent dsde) {
            }

            @Override
            public void dragOver(DragSourceDragEvent dsde) {
            }

            @Override
            public void dropActionChanged(DragSourceDragEvent dsde) {
            }

            @Override
            public void dragExit(DragSourceEvent dse) {
            }

            @Override
            public void dragDropEnd(DragSourceDropEvent dsde) {
                int action = dsde.getDropAction();
                System.out.println("Drop action: " + action);
            }
        });
    }
}
