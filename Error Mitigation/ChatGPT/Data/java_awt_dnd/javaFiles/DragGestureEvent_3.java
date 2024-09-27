import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragSource;

public class DragGestureEvent_3 {
    public static void main(String[] args) {
        DragGestureEvent event = new DragGestureEvent(null, 0, 0, 0, null);
        DragSource dragSource = event.getDragSource();
        System.out.println("DragSource: " + dragSource);
    }
}
