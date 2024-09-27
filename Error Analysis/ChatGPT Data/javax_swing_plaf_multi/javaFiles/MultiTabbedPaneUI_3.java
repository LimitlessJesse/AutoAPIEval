import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTabbedPaneUI;

public class MultiTabbedPaneUI_3 {
    public static void main(String[] args) {
        MultiTabbedPaneUI multiTabUI = new MultiTabbedPaneUI();
        JComponent component = new JComponent(); // example component
        multiTabUI.uninstallUI(component);
    }
}
