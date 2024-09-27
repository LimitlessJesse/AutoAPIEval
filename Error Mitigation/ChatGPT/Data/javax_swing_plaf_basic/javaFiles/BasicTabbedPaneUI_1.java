import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class BasicTabbedPaneUI_1 {
    public static void main(String[] args) {
        BasicTabbedPaneUI basicTabbedPaneUI = new BasicTabbedPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicTabbedPaneUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
