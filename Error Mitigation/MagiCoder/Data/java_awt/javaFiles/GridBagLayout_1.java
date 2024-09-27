import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagLayout_1 {
    public static void main(String[] args) {
        GridBagLayout layout = new GridBagLayout();
        Component component = new Component();
        GridBagConstraints constraints = new GridBagConstraints();
        layout.addLayoutComponent(component, constraints);
    }
}
