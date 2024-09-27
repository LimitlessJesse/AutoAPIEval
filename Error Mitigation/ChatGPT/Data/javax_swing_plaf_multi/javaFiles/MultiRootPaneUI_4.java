import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiRootPaneUI;

public class MultiRootPaneUI_4 {
    public static void main(String[] args) {
        MultiRootPaneUI multiRootPaneUI = new MultiRootPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiRootPaneUI.uninstallUI(component);
    }
}
