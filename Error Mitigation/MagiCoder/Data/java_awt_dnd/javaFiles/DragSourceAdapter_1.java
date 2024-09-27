import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.*;

public class DragSourceAdapter_1 {
    public static void main(String[] args) {
        DragSource ds = DragSource.getDefaultDragSource();
        DragSourceAdapter dsa = new DragSourceAdapter() {
            public void dragEnter(DragSourceDragEvent dsde) {
                System.out.println("Drag enter event occurred");
            }
        };
        ds.createDefaultDragGestureRecognizer(new Component() {
            public Point getLocationOnScreen() {
                return new Point(0, 0);
            }
        }, DnDConstants.ACTION_COPY_OR_MOVE, dsa);
    }
}
