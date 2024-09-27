import java.awt.dnd.DragSourceDragEvent;

public class DragSourceDragEvent_5 {
    public static void main(String[] args) {
        DragSourceDragEvent event = new DragSourceDragEvent();
        int modifiers = event.getGestureModifiers();
        System.out.println("Gesture Modifiers: " + modifiers);
    }
}
