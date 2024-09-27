import javax.swing.OverlayLayout;
import java.awt.Container;
import java.awt.Dimension;

public class OverlayLayout_4 {
    public static void main(String[] args) {
        // Create a Container object
        Container target = new Container();

        // Create an OverlayLayout object
        OverlayLayout overlayLayout = new OverlayLayout(target);

        // Get the minimum layout size using minimumLayoutSize()
        Dimension minSize = overlayLayout.minimumLayoutSize(target);

        // Print the minimum layout size
        System.out.println("Minimum Layout Size: " + minSize);
    }
}
