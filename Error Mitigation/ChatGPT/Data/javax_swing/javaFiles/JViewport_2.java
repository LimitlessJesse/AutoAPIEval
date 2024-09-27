import javax.swing.JViewport;
import java.awt.Component;

public class JViewport_2 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        Component view = viewport.getView();
        System.out.println("Viewport's child: " + view);
    }
}
