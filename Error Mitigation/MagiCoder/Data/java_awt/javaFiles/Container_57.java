import java.awt.Component;
import java.awt.Container;

public class Container_57 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component1 = new Component();
        Component component2 = new Component();

        container.add(component1);
        container.add(component2);

        container.setComponentZOrder(component1, 1);
        container.setComponentZOrder(component2, 0);
    }
}
