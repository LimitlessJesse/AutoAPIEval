import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTableUI;

public class BasicTableUI_1 {
    public static void main(String[] args) {
        BasicTableUI basicTableUI = new BasicTableUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicTableUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
