import javax.swing.*;
import javax.swing.plaf.multi.MultiPanelUI;

public class MultiPanelUI_30 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            // Implement your component here
        };

        MultiPanelUI multiPanelUI = new MultiPanelUI();
        multiPanelUI.uninstallUI(component);
    }
}
