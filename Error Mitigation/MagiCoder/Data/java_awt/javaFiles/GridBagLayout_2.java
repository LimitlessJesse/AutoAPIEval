import java.awt.GridBagLayout;
import java.awt.Component;

public class GridBagLayout_2 {
    public static void main(String[] args) {
        GridBagLayout layout = new GridBagLayout();
        Component component = new Component();
        layout.addLayoutComponent("Component1", component);
    }
}
