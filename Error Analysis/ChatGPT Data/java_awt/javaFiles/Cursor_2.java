import java.awt.Cursor;

public class Cursor_2 {
    public static void main(String[] args) {
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        System.out.println("Predefined Cursor type: " + cursor.getType());
    }
}
