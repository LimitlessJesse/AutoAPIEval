import java.awt.dnd.DragGestureEvent;

public class DragGestureEvent_3 {
    public static void main(String[] args) {
        DragGestureEvent event = null; // Create a DragGestureEvent object
        int dragAction = event.getDragAction(); // Get the drag action
        System.out.println("Drag action: " + dragAction);
    }
}
