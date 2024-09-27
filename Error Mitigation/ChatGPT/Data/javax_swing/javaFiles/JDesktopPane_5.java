import javax.swing.JDesktopPane;
import java.awt.Component;

public class JDesktopPane_5 {
    public static void main(String[] args) {
        JDesktopPane desktopPane = new JDesktopPane();
        
        // Create a component
        Component component = new Component();
        
        // Set the z-order index for the component
        desktopPane.setComponentZOrder(component, 0);
    }
}
