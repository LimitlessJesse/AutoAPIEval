import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;

public class DragSourceAdapter_3 {
    public static void main(String[] args) {
        DragSource ds = DragSource.getDefaultDragSource();
        MyDragSourceListener listener = new MyDragSourceListener();
        ds.createDefaultDragGestureRecognizer(listener, DnDConstants.ACTION_COPY_OR_MOVE, true);
    }
}

class MyDragSourceListener extends DragSourceAdapter {
    public void dropActionChanged(DragSourceDragEvent dsde) {
        System.out.println("Drop action changed: " + dsde.getDropAction());
    }
}
