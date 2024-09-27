import javax.swing.ViewportLayout;
import java.awt.Container;

public class ViewportLayout_3 {
    public static void main(String[] args) {
        ViewportLayout viewportLayout = new ViewportLayout();
        Container parent = new Container(); // Create a container to pass to the layoutContainer method
        viewportLayout.layoutContainer(parent);
    }
}
