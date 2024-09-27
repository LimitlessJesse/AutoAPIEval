import java.awt.dnd.DragSourceDragEvent;

public class DragSourceDragEvent_2 {
    public static void main(String[] args) {
        // Assuming dragEvent is an instance of DragSourceDragEvent
        int modifiers = dragEvent.getGestureModifiers();
        System.out.println("Gesture Modifiers: " + modifiers);
    }
}
