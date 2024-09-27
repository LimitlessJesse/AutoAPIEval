import java.awt.Container;
import java.awt.Component;

public class Container_4 {
    public static void main(String[] args) {
        Container container = new Container();
        Component[] components = container.getComponents();
        
        for (Component component : components) {
            container.remove(component);
        }
    }
}
