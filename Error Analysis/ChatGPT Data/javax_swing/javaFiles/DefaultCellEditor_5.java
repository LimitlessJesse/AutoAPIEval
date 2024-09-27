import javax.swing.DefaultCellEditor;
import java.util.EventObject;

public class DefaultCellEditor_5 {
    public static void main(String[] args) {
        DefaultCellEditor cellEditor = new DefaultCellEditor();
        boolean isEditable = cellEditor.isCellEditable(new EventObject(new Object()));
        System.out.println("Is cell editable? " + isEditable);
    }
}
