import javax.swing.ScrollPaneLayout;
import java.awt.Container;
import java.awt.Dimension;

public class ScrollPaneLayout_2 {
    public static void main(String[] args) {
        ScrollPaneLayout scrollPaneLayout = new ScrollPaneLayout();
        Container parent = new Container(); // Create a Container object for demonstration
        Dimension preferredSize = scrollPaneLayout.preferredLayoutSize(parent);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
