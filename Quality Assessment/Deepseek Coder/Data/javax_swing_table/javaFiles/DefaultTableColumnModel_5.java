import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableColumnModel;

public class DefaultTableColumnModel_5 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel(new Object[][] {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" }
        }, new Object[] {
            "Column 1", "Column 2", "Column 3"
        });

        JTable table = new JTable(model);
        DefaultTableColumnModel columnModel = (DefaultTableColumnModel) table.getColumnModel();

        TableColumn column = columnModel.getColumn(0);
        columnModel.removeColumn(column);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
