import javax.swing.ViewportLayout;
import java.awt.Container;
import java.awt.Dimension;

public class ViewportLayout_1 {
    public static void main(String[] args) {
        ViewportLayout viewportLayout = new ViewportLayout();
        Container parent = new Container(); // Create a container for testing
        Dimension preferredSize = viewportLayout.preferredLayoutSize(parent);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
