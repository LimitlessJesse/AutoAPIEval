import javax.swing.JViewport;
import java.awt.Dimension;

public class JViewport_6 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        Dimension viewSize = viewport.getViewSize();
        System.out.println("View size: " + viewSize);
    }
}
