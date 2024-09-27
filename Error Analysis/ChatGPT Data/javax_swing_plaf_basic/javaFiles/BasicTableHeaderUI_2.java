import javax.swing.plaf.basic.BasicTableHeaderUI;
import javax.swing.*;

public class BasicTableHeaderUI_2 {
    public static void main(String[] args) {
        JTable table = new JTable();
        JTableHeader tableHeader = table.getTableHeader();
        BasicTableHeaderUI ui = new BasicTableHeaderUI();
        
        ui.uninstallUI(tableHeader);
        
        System.out.println("TableHeader UI uninstalled successfully.");
    }
}
