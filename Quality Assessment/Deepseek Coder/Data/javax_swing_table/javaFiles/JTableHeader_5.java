import javax.swing.table.JTableHeader;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableHeader_5 {
    public static void main(String[] args) {
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        Object[][] data = {{"Cell 1", "Cell 2", "Cell 3"}, {"Cell 4", "Cell 5", "Cell 6"}};
        JTable table = new JTable(data, columnNames);
        JTableHeader header = table.getTableHeader();
        header.setResizingAllowed(false); // Disable resizing of columns

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
