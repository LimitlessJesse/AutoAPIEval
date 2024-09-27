import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiTableHeaderUI;

public class MultiTableHeaderUI_4 {
    public static void main(String[] args) {
        MultiTableHeaderUI multiTableHeaderUI = new MultiTableHeaderUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        multiTableHeaderUI.uninstallUI(component);
    }
}
