import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class DefaultCellEditor_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Object[][] data = {{"John", "Doe"}, {"Jane", "Doe"}};
        String[] columnNames = {"First Name", "Last Name"};
        JTable table = new JTable(data, columnNames);

        DefaultCellEditor editor = new DefaultCellEditor(table.getColumnModel().getColumn(0));
        editor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cell edited");
            }
        });

        table.getColumnModel().getColumn(0).setCellEditor(editor);

        frame.add(table);
        frame.setSize(400, 200);
        frame.setVisible(true);

        EventObject event = new ActionEvent(table, 0, "");
        boolean isEditable = editor.isCellEditable(event);
        System.out.println("Is cell editable? " + isEditable);
    }
}
