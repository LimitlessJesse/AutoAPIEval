import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetEvent;

public class DropTargetEvent_1 {
    public static void main(String[] args) {
        DropTargetEvent event = new DropTargetEvent();
        DropTargetContext context = event.getDropTargetContext();
        System.out.println("DropTargetContext: " + context);
    }
}
