import javax.swing.AbstractCellEditor;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import java.util.EventObject;

public class AbstractCellEditor_2 {
    public static void main(String[] args) {
        MyCellEditor cellEditor = new MyCellEditor();
        boolean result = cellEditor.stopCellEditing();
        System.out.println("Stop cell editing result: " + result);
    }

    static class MyCellEditor extends AbstractCellEditor implements TableCellEditor {
        @Override
        public boolean stopCellEditing() {
            fireEditingStopped();
            return true;
        }

        @Override
        public Object getCellEditorValue() {
            return null;
        }

        @Override
        public boolean isCellEditable(EventObject anEvent) {
            return false;
        }

        @Override
        public boolean shouldSelectCell(EventObject anEvent) {
            return false;
        }

        @Override
        public boolean startCellEditing(EventObject anEvent) {
            return false;
        }

        @Override
        public void cancelCellEditing() {
            fireEditingCanceled();
        }

        @Override
        public void addCellEditorListener(CellEditorListener l) {
            // Not implemented
        }

        @Override
        public void removeCellEditorListener(CellEditorListener l) {
            // Not implemented
        }
    }
}
