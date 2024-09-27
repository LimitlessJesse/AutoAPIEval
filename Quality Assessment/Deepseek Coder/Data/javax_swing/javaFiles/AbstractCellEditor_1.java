import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.util.EventObject;

public class AbstractCellEditor_1 {
    public static void main(String[] args) {
        // Usage of isCellEditable method
        AbstractCellEditor cellEditor = new AbstractCellEditor() {
            @Override
            public boolean isCellEditable(EventObject anEvent) {
                // Custom logic to determine if the cell is editable
                return false;
            }
        };

        EventObject event = new EventObject(cellEditor);
        boolean isEditable = cellEditor.isCellEditable(event);
        System.out.println("Is cell editable? " + isEditable);
    }
}
