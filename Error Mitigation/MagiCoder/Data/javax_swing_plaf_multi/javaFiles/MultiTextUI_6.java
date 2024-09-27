import javax.swing.*;
import javax.swing.plaf.multi.MultiTextUI;

public class MultiTextUI_6 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiTextUI multiTextUI = new MultiTextUI();
        multiTextUI.uninstallUI(component);
    }
}
