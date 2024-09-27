import javax.swing.*;
import javax.swing.plaf.multi.MultiScrollPaneUI;

public class MultiScrollPaneUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiScrollPaneUI multiScrollPaneUI = new MultiScrollPaneUI();
        multiScrollPaneUI.uninstallUI(component);
    }
}
