import java.awt.dnd.DragGestureEvent;
import java.awt.Point;

public class DragGestureEvent_4 {
    public static void main(String[] args) {
        DragGestureEvent dge = new DragGestureEvent(null, 0, new Point(10, 20), null, null);
        Point dragOrigin = dge.getDragOrigin();
        
        System.out.println("Drag Origin: " + dragOrigin);
    }
}
