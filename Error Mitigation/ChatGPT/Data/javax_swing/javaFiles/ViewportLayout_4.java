import javax.swing.ViewportLayout;
import java.awt.Component;

public class ViewportLayout_4 {
    public static void main(String[] args) {
        ViewportLayout layout = new ViewportLayout();
        Component component = new Component() {};
        layout.addLayoutComponent("name", component);
    }
}
