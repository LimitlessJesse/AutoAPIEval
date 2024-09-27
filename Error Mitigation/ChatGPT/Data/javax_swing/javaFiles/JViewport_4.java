import javax.swing.JViewport;
import java.awt.Point;

public class JViewport_4 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        Point viewPosition = viewport.getViewPosition();
        System.out.println("View position: " + viewPosition);
    }
}
