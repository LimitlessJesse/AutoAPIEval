import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceEvent;

public class DragSourceEvent_2 {
    public static void main(String[] args) {
        DragSourceEvent event = new DragSourceEvent(new DragSourceContext(), 0, 0, 0);
        DragSourceContext context = event.getDragSourceContext();
        System.out.println("Drag Source Context: " + context);
    }
}
