import javax.swing.JViewport;
import java.awt.Rectangle;

public class JViewport_5 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        Rectangle contentRect = new Rectangle(100, 100, 200, 200);
        viewport.scrollRectToVisible(contentRect);
    }
}
