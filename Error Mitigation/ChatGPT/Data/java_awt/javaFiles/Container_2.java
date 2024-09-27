import java.awt.Component;
import java.awt.Container;

public class Container_2 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component = new Component() {};
        
        container.add(component);
        System.out.println("Before removal: " + container.getComponentCount());
        
        container.remove(component);
        System.out.println("After removal: " + container.getComponentCount());
    }
}
