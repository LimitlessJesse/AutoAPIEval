import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;

public class DefaultCellEditor_2 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        TableCellEditor editor = new DefaultCellEditor(new DefaultTableCellRenderer());
        Component component = editor.getTableCellEditorComponent(table, "Hello", false, 0, 0);
        System.out.println(component);
    }
}
