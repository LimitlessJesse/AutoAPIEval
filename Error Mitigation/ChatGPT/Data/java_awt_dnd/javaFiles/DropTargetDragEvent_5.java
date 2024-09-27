import java.awt.dnd.DropTargetDragEvent;

public class DropTargetDragEvent_5 {
    public static void main(String[] args) {
        DropTargetDragEvent event = new DropTargetDragEvent();
        int dropAction = event.getDropAction();
        System.out.println("User drop action: " + dropAction);
    }
}
