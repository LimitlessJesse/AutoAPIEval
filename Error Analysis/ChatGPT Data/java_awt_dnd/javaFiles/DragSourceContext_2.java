import java.awt.dnd.DragSourceContext;
import java.awt.Cursor;

public class DragSourceContext_2 {
    public static void main(String[] args) {
        DragSourceContext dragSourceContext = new DragSourceContext(null, null, null);
        Cursor cursor = dragSourceContext.getCursor();
        System.out.println("Current cursor: " + cursor);
    }
}
