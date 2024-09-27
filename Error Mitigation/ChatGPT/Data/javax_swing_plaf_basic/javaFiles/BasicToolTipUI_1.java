import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

public class BasicToolTipUI_1 {
    public static void main(String[] args) {
        BasicToolTipUI basicToolTipUI = new BasicToolTipUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicToolTipUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
