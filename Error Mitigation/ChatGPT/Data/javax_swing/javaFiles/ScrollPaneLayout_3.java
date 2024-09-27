import javax.swing.ScrollPaneLayout;
import java.awt.Container;
import java.awt.Dimension;

public class ScrollPaneLayout_3 {
    public static void main(String[] args) {
        ScrollPaneLayout scrollPaneLayout = new ScrollPaneLayout();
        Container parent = new Container(); // Create a Container object for testing
        Dimension minimumSize = scrollPaneLayout.minimumLayoutSize(parent);
        System.out.println("Minimum size: " + minimumSize);
    }
}
