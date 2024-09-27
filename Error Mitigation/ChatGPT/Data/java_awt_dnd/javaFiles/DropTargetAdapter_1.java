import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;

public class DropTargetAdapter_1 {
    public static void main(String[] args) {
        // Create an instance of DropTargetAdapter
        DropTargetAdapter adapter = new DropTargetAdapter() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
                // Implement your logic here when drag operation enters the drop site
                System.out.println("Drag operation entered the drop site");
            }
        };
    }
}
