import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_2 {
    public static void main(String[] args) {
        BasicRootPaneUI ui = new BasicRootPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ui.uninstallUI(component);
    }
}
