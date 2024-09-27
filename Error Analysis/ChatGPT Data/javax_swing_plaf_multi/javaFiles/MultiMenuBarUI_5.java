import javax.swing.plaf.multi.MultiMenuBarUI;
import javax.swing.JComponent;

public class MultiMenuBarUI_5 {
    public static void main(String[] args) {
        MultiMenuBarUI multiMenuBarUI = new MultiMenuBarUI();
        JComponent component = new JComponent() {};

        multiMenuBarUI.uninstallUI(component);
    }
}
