import java.awt.Container;
import java.awt.Component;

public class Container_4 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component1 = new Component();
        Component component2 = new Component();

        container.add(component1);
        container.add(component2);

        Component[] components = container.getComponents();

        for (Component component : components) {
            System.out.println(component);
        }
    }
}
