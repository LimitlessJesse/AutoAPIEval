import javax.swing.ViewportLayout;
import java.awt.Container;
import java.awt.Dimension;

public class ViewportLayout_2 {
    public static void main(String[] args) {
        ViewportLayout viewportLayout = new ViewportLayout();
        Container parent = new Container(); // Create a container to pass as parameter
        Dimension minimumLayoutSize = viewportLayout.minimumLayoutSize(parent);
        System.out.println("Minimum Layout Size: " + minimumLayoutSize);
    }
}
