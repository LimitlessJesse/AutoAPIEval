import javax.swing.ScrollPaneLayout;
import java.awt.Container;

public class ScrollPaneLayout_1 {
    public static void main(String[] args) {
        ScrollPaneLayout scrollPaneLayout = new ScrollPaneLayout();
        Container parent = new Container(); // You need to provide the actual container object here
        scrollPaneLayout.layoutContainer(parent);
    }
}
