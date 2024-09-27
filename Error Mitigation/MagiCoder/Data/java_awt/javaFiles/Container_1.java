import java.awt.Container;
import java.awt.Component;
import java.awt.GridLayout;

public class Container_1 {
    public static void main(String[] args) {
        Container container = new Container();
        container.setLayout(new GridLayout(1, 1));

        Component component = new Component() {
            // You can override methods here if needed
        };

        container.add(component);
    }
}
