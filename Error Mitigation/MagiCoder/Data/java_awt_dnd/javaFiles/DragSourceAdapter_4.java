import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.event.*;
import java.awt.*;

public class DragSourceAdapter_4 {
    public static void main(String[] args) {
        DragSource ds = DragSource.getDefaultDragSource();
        DragSourceListener listener = new DragSourceAdapter() {
            public void dragExit(DragSourceEvent dse) {
                System.out.println("Drag Exit");
            }
        };
        ds.addDragSourceListener(listener);
    }
}
