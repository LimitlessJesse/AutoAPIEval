import java.awt.Cursor;
import java.awt.dnd.DragSourceContext;

public class DragSourceContext_4 {
    public static void main(String[] args) {
        DragSourceContext dragSourceContext = new DragSourceContext();
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        dragSourceContext.setCursor(cursor);
    }
}
