import java.awt.Cursor;

public class Cursor_1 {
    public static void main(String[] args) {
        Cursor cursor = new Cursor(Cursor.DEFAULT_CURSOR);
        int type = cursor.getType();
        System.out.println("Cursor type: " + type);
    }
}
