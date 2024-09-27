import java.awt.dnd.DropTargetDragEvent;

public class DropTargetDragEvent_5 {
    public static void main(String[] args) {
        // Create a DropTargetDragEvent instance
        DropTargetDragEvent dropEvent = new DropTargetDragEvent(null, 0, 0, 0);
        
        // Get the drop action
        int dropAction = dropEvent.getDropAction();
        
        System.out.println("Drop Action: " + dropAction);
    }
}
