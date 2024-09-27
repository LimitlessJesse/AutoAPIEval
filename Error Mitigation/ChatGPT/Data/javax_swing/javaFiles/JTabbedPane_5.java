import javax.swing.JTabbedPane;
import java.awt.Component;

public class JTabbedPane_5 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Add components to the tabbed pane
        
        Component selectedComponent = tabbedPane.getSelectedComponent();
        if(selectedComponent != null) {
            System.out.println("Selected component: " + selectedComponent);
        } else {
            System.out.println("No selected component");
        }
    }
}
