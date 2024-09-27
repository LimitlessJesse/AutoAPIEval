import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

public class Container_9 {
    public static void main(String[] args) {
        Container container = new Container();
        container.setLayout(new GridLayout(1, 1));

        Component component1 = new Component();
        Component component2 = new Component();

        container.add(component1);
        container.add(component2);

        container.remove(component1);
    }
}
