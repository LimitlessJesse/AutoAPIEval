import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDropEvent;

public class DragSourceAdapter_5 {
    public static void main(String[] args) {
        DragSourceAdapter adapter = new DragSourceAdapter() {
            @Override
            public void dragDropEnd(DragSourceDropEvent dsde) {
                boolean dropSuccess = dsde.getDropSuccess();
                int dropAction = dsde.getDropAction();
                
                System.out.println("Drag and Drop operation complete.");
                System.out.println("Drop success: " + dropSuccess);
                System.out.println("Drop action: " + dropAction);
            }
        };
    }
}
