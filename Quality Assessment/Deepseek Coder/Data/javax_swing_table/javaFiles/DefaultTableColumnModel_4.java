import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_4 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new DefaultTableColumnModel
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();

        // Create a new TableColumn
        TableColumn column = new TableColumn();
        column.setHeaderValue("Column 1");
        column.setModelIndex(0);

        // Add the TableColumn to the DefaultTableColumnModel
        columnModel.addColumn(column);

        // Create a new JTable with the DefaultTableColumnModel
        JTable table = new JTable(columnModel);

        // Add the JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the JFrame
        frame.getContentPane().add(scrollPane);

        // Set the size and make the JFrame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
