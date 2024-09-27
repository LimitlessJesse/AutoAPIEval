import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_1 {
    public static void main(String[] args) {
        BasicRootPaneUI basicRootPaneUI = new BasicRootPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicRootPaneUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
