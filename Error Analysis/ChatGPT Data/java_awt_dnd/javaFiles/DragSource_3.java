import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceListener;

public class DragSource_3 {
    public static void main(String[] args) {
        DragSource dragSource = new DragSource();
        DragSourceListener listener = new MyDragSourceListener();
        
        // Remove the DragSourceListener from the DragSource
        dragSource.removeDragSourceListener(listener);
    }
    
    static class MyDragSourceListener implements DragSourceListener {
        // Implement DragSourceListener methods
    }
}
