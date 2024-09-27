import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;

public class Cursor_2 {
    public static void main(String[] args) {
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(
                new java.awt.Image[] { new java.awt.PixelGrabber(null, 0, 0, 1, 1, null).getPixel(0, 0),
                        new java.awt.PixelGrabber(null, 0, 0, 1, 1, null).getPixel(0, 0) },
                new Point(0, 0), "wait");

        int type = cursor.getType();
        System.out.println("Cursor type: " + type);
    }
}
