import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDragEvent;

public class DragSourceAdapter_3 {
    public static void main(String[] args) {
        DragSourceAdapter adapter = new DragSourceAdapter() {
            @Override
            public void dropActionChanged(DragSourceDragEvent dsde) {
                // Add your implementation here
                System.out.println("Drop action changed");
            }
        };
    }
}
