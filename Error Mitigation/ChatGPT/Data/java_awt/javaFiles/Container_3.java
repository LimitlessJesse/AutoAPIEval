import java.awt.Component;
import java.awt.Container;

public class Container_3 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component = container.getComponent(0);
        System.out.println(component);
    }
}
