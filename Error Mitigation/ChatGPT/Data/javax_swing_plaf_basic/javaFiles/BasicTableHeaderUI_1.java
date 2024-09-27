import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTableHeaderUI;

public class BasicTableHeaderUI_1 {
    public static void main(String[] args) {
        BasicTableHeaderUI basicTableHeaderUI = new BasicTableHeaderUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicTableHeaderUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
