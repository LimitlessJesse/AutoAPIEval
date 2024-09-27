import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import java.awt.event.ActionEvent;

public class DefaultCellEditor_1 {
    public static void main(String[] args) {
        JTable table = new JTable();
        DefaultCellEditor editor = new DefaultCellEditor(table);
        ActionEvent event = new ActionEvent(this, 0, "");
        boolean isEditable = editor.isCellEditable(event);
        System.out.println("Is cell editable: " + isEditable);
    }
}
