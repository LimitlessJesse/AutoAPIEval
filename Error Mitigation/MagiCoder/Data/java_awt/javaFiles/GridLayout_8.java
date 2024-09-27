import java.awt.Component;
import java.awt.GridLayout;

public class GridLayout_8 {
    public static void main(String[] args) {
        GridLayout gridLayout = new GridLayout(3, 3);
        Component component1 = new Component() {};
        Component component2 = new Component() {};

        gridLayout.addLayoutComponent("Component1", component1);
        gridLayout.addLayoutComponent("Component2", component2);
    }
}
