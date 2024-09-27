import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import java.util.EventObject;

public class AbstractCellEditor_1 {
    public static void main(String[] args) {
        AbstractCellEditor editor = new AbstractCellEditor() {
            @Override
            public boolean isCellEditable(EventObject e) {
                return true;
            }
        };

        // You can use the editor here
    }
}
