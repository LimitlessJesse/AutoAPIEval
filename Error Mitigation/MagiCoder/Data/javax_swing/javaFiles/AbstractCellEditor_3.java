import javax.swing.*;
import javax.swing.event.CellEditorListener;

public class AbstractCellEditor_3 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        AbstractCellEditor abstractCellEditor = new AbstractCellEditor() {
            @Override
            public Object getCellEditorValue() {
                return null;
            }
        };

        abstractCellEditor.addCellEditorListener(new CellEditorListener() {
            @Override
            public void editingCanceled(ChangeEvent e) {
                System.out.println("Editing canceled");
            }

            @Override
            public void editingStopped(ChangeEvent e) {
                System.out.println("Editing stopped");
            }
        });
    }
}
