import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

public class DefaultCellEditor_3 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        DefaultCellEditor editor = new DefaultCellEditor(textField);
        editor.setValue("Hello");
        Object value = editor.getCellEditorValue();
        System.out.println(value);
    }
}
