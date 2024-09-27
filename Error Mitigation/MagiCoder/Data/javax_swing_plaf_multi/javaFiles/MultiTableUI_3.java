import javax.swing.*;
import javax.swing.plaf.multi.MultiTableUI;

public class MultiTableUI_3 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        MultiTableUI multiTableUI = new MultiTableUI();
        multiTableUI.uninstallUI(table);
    }
}
