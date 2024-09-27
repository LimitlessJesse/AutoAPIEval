import javax.swing.JViewport;
import java.awt.Point;

public class JViewport_3 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        Point p = new Point(10, 10);
        viewport.setViewPosition(p);
    }
}
