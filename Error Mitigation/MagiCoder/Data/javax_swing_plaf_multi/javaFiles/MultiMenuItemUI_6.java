import javax.swing.*;
import javax.swing.plaf.multi.MultiMenuItemUI;

public class MultiMenuItemUI_6 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiMenuItemUI multiMenuItemUI = new MultiMenuItemUI();
        multiMenuItemUI.uninstallUI(component);
    }
}
