import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class DefaultCellEditor_4 {
    public static void main(String[] args) {
        JTable table = new JTable();
        TableCellEditor editor = table.getCellEditor();
        if (editor instanceof DefaultCellEditor) {
            DefaultCellEditor defaultCellEditor = (DefaultCellEditor) editor;
            defaultCellEditor.cancelCellEditing();
        }
    }
}
