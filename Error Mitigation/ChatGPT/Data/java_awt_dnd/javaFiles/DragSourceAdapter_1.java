import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDragEvent;

public class DragSourceAdapter_1 {
    public static void main(String[] args) {
        // Create an instance of DragSourceAdapter
        DragSourceAdapter adapter = new DragSourceAdapter();

        // Call the dragEnter method with a dummy DragSourceDragEvent
        adapter.dragEnter(new DragSourceDragEvent(null, 0, 0));
    }
}
