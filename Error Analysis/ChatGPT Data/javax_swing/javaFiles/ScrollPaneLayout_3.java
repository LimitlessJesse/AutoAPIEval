import javax.swing.ScrollPaneLayout;
import java.awt.*;

public class ScrollPaneLayout_3 {
    public static void main(String[] args) {
        ScrollPaneLayout layout = new ScrollPaneLayout();
        Container parent = new Container();
        Dimension minSize = layout.minimumLayoutSize(parent);
        System.out.println("Minimum Layout Size: " + minSize);
    }
}
