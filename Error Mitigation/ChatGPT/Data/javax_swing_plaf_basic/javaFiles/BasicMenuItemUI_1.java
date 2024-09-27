import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;

public class BasicMenuItemUI_1 {
    public static void main(String[] args) {
        BasicMenuItemUI basicMenuItemUI = new BasicMenuItemUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicMenuItemUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
