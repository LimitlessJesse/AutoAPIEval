import java.awt.Cursor;

public class Cursor_4 {
    public static void main(String[] args) {
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        int cursorType = cursor.getType();
        System.out.println("Cursor type: " + cursorType);
    }
}
