import javax.swing.JLayeredPane;
import java.awt.Component;

public class JLayeredPane_2 {
    public static void main(String[] args) {
        JLayeredPane layeredPane = new JLayeredPane();
        Component component = new Component() {}; // Creating a dummy component for demonstration
        layeredPane.add(component); // Adding the component to the layered pane
        
        // Moving the component to position 1 within its current layer
        layeredPane.setPosition(component, 1);
    }
}
