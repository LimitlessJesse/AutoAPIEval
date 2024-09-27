import javax.swing.*;
import javax.swing.plaf.multi.MultiToolTipUI;

public class MultiToolTipUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiToolTipUI multiToolTipUI = new MultiToolTipUI();
        multiToolTipUI.uninstallUI(component);
    }
}
