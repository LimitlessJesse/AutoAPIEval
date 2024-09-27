import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragSourceContext;
import java.awt.Component;

public class DragGestureEvent_2 {
    public static void main(String[] args) {
        DragGestureEvent dge = new DragGestureEvent(new DragSourceContext(), 0, 0, 0, null);

        Component component = dge.getComponent();
        System.out.println("Component: " + component);
    }
}
