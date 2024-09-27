import javax.swing.OverlayLayout;
import java.awt.Container;
import java.awt.Dimension;

public class OverlayLayout_3 {
    public static void main(String[] args) {
        OverlayLayout overlayLayout = new OverlayLayout(new Container());

        // Call preferredLayoutSize method
        Dimension preferredSize = overlayLayout.preferredLayoutSize(new Container());
        System.out.println("Preferred size: " + preferredSize);
    }
}
