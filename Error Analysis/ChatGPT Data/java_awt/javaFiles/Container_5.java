import java.awt.Component;
import java.awt.Container;

public class Container_5 {
    public static void main(String[] args) {
        // Create a container
        Container container = new Container();
        
        // Get an array of all components in the container
        Component[] components = container.getComponents();
        
        // Print the number of components
        System.out.println("Number of components: " + components.length);
    }
}
