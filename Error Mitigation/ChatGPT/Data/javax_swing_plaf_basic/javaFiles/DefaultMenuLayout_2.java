import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.Container;
import java.awt.Dimension;

public class DefaultMenuLayout_2 {
    public static void main(String[] args) {
        DefaultMenuLayout layout = new DefaultMenuLayout();
        Container target = new Container(); // Create a container to pass as a parameter
        Dimension preferredSize = layout.preferredLayoutSize(target);
        System.out.println("Preferred Layout Size: " + preferredSize);
    }
}
