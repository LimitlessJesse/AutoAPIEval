import javax.swing.*;
import javax.swing.plaf.multi.MultiTableHeaderUI;

public class MultiTableHeaderUI_4 {
    public static void main(String[] args) {
        JTable table = new JTable();
        MultiTableHeaderUI multiTableHeaderUI = new MultiTableHeaderUI();
        multiTableHeaderUI.uninstallUI(table);
    }
}
