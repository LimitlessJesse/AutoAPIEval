import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class JTableHeader_1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DefaultTableModel model = new DefaultTableModel(new Object[][] {
                    { "Column 1", "Column 2", "Column 3" },
                    { "Value 1", "Value 2", "Value 3" },
                    { "Value 4", "Value 5", "Value 6" }
                }, new Object[] {
                    "Header 1", "Header 2", "Header 3"
                });

                JTable table = new JTable(model);
                JTableHeader header = table.getTableHeader();
                header.setReorderingAllowed(false); // Disable column reordering

                JFrame frame = new JFrame("JTable Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
