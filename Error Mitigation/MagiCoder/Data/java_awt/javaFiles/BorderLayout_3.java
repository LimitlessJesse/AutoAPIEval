import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

public class BorderLayout_3 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component = new Component();

        BorderLayout borderLayout = new BorderLayout();
        borderLayout.addLayoutComponent(component, BorderLayout.CENTER);

        container.add(component);
    }
}
