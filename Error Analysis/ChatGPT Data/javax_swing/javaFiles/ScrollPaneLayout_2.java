import javax.swing.ScrollPaneLayout;
import java.awt.Container;
import java.awt.Dimension;

public class ScrollPaneLayout_2 {
    public static void main(String[] args) {
        ScrollPaneLayout layout = new ScrollPaneLayout();
        Container parent = new Container(); // You would typically pass the actual parent container here
        Dimension preferredSize = layout.preferredLayoutSize(parent);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
