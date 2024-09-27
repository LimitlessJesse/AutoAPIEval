import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class BasicButtonUI_1 {
    public static void main(String[] args) {
        BasicButtonUI basicButtonUI = new BasicButtonUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicButtonUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
