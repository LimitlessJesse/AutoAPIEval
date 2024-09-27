import javax.swing.*;
import javax.swing.plaf.multi.MultiDesktopPaneUI;

public class MultiDesktopPaneUI_6 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiDesktopPaneUI multiDesktopPaneUI = new MultiDesktopPaneUI();
        multiDesktopPaneUI.uninstallUI(component);
    }
}
