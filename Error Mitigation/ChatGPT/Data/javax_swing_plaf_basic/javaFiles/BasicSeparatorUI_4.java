import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class BasicSeparatorUI_4 {
    public static void main(String[] args) {
        BasicSeparatorUI ui = new BasicSeparatorUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ui.uninstallUI(component);
    }
}
