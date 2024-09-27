import javax.swing.*;
import javax.swing.plaf.multi.MultiToolTipUI;

public class MultiToolTipUI_3 {
    public static void main(String[] args) {
        JComponent component = new JButton("Click me");
        MultiToolTipUI ui = new MultiToolTipUI();
        ui.uninstallUI(component);
        System.out.println("UI uninstalled from component");
    }
}
