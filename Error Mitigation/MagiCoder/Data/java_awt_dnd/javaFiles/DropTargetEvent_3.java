import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetContext;

public class DropTargetEvent_3 {
    public static void main(String[] args) {
        DropTargetEvent event = new DropTargetEvent(null, 0, 0, 0, 0, 0, false, null);
        DropTargetContext context = event.getDropTargetContext();
        System.out.println(context);
    }
}
