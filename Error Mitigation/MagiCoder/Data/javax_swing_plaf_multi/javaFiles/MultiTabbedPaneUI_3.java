import javax.swing.*;
import javax.swing.plaf.multi.MultiTabbedPaneUI;

public class MultiTabbedPaneUI_3 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JPanel());
        tabbedPane.addTab("Tab 2", new JPanel());

        MultiTabbedPaneUI multiTabbedPaneUI = new MultiTabbedPaneUI();
        multiTabbedPaneUI.uninstallUI(tabbedPane);
    }
}
