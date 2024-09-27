import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiMenuBarUI;

public class MultiMenuBarUI_4 {
    public static void main(String[] args) {
        MultiMenuBarUI multiMenuBarUI = new MultiMenuBarUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiMenuBarUI.uninstallUI(component);
    }
}
