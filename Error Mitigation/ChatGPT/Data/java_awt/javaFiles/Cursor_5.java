import java.awt.Cursor;

public class Cursor_5 {
    public static void main(String[] args) {
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
        String cursorName = cursor.getName();
        System.out.println("Cursor name: " + cursorName);
    }
}
