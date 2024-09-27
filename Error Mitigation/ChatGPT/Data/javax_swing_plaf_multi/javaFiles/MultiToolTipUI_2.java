import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiToolTipUI;

public class MultiToolTipUI_2 {
    public static void main(String[] args) {
        MultiToolTipUI multiToolTipUI = new MultiToolTipUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiToolTipUI.uninstallUI(component);
    }
}
