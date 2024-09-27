import javax.swing.*;
import javax.swing.plaf.multi.MultiTreeUI;

public class MultiTreeUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiTreeUI multiTreeUI = new MultiTreeUI();
        multiTreeUI.uninstallUI(component);
    }
}
