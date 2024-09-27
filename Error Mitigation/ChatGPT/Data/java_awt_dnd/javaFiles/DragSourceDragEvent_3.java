import java.awt.dnd.DragSourceDragEvent;

public class DragSourceDragEvent_3 {
    public static void main(String[] args) {
        DragSourceDragEvent dragEvent = new DragSourceDragEvent();
        int targetActions = dragEvent.getTargetActions();
        System.out.println("Target drop action: " + targetActions);
    }
}
