import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceEvent;

public class DragSourceAdapter_4 {
    public static void main(String[] args) {
        // Create an instance of DragSourceAdapter
        DragSourceAdapter adapter = new DragSourceAdapter();

        // Call the dragExit method with a DragSourceEvent parameter
        adapter.dragExit(new DragSourceEvent(null, 0));
    }
}
