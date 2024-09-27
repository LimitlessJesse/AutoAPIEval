import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDragEvent;

public class DragSourceAdapter_2 {
    public static void main(String[] args) {
        DragSourceAdapter adapter = new DragSourceAdapter() {
            @Override
            public void dragOver(DragSourceDragEvent dsde) {
                // Add your implementation here
                System.out.println("Cursor's hotspot is moving over the drop site");
            }
        };
    }
}
