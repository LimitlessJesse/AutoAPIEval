import javax.swing.*;
import javax.swing.plaf.multi.MultiSplitPaneUI;

public class MultiSplitPaneUI_6 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiSplitPaneUI multiSplitPaneUI = new MultiSplitPaneUI();
        multiSplitPaneUI.uninstallUI(component);
    }
}
