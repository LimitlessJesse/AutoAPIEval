import javax.swing.*;
import javax.swing.plaf.multi.MultiRootPaneUI;

public class MultiRootPaneUI_24 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiRootPaneUI multiRootPaneUI = new MultiRootPaneUI();
        multiRootPaneUI.uninstallUI(component);
    }
}
