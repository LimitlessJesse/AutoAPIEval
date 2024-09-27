import javax.swing.JLayeredPane;
import java.awt.Component;

public class JLayeredPane_4 {
    public static void main(String[] args) {
        JLayeredPane layeredPane = new JLayeredPane();
        Component component = new Component() {}; // create a sample component
        layeredPane.add(component); // add component to layered pane
        layeredPane.moveToFront(component); // move component to the front
    }
}
