import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class BasicButtonUI_2 {
    public static void main(String[] args) {
        BasicButtonUI basicButtonUI = new BasicButtonUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicButtonUI.uninstallUI(component);
    }
}
