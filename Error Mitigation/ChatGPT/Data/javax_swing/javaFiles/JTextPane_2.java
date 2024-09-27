import javax.swing.JTextPane;
import java.awt.Component;

public class JTextPane_2 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        Component component = new Component() {}; // Create a sample component
        
        textPane.insertComponent(component);
    }
}
