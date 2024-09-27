import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureRecognizer;

public class DragGestureEvent_4 {
    public static void main(String[] args) {
        DragGestureEvent event = new DragGestureEvent(null, 0, 0, 0, null);
        DragGestureRecognizer recognizer = event.getSourceAsDragGestureRecognizer();
        System.out.println("Source as DragGestureRecognizer: " + recognizer);
    }
}
