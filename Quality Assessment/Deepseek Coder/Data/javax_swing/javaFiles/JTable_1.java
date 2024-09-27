import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class JTable_1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                String[][] data = {
                    {"Row1", "Data1"},
                    {"Row2", "Data2"},
                    {"Row3", "Data3"}
                };

                JFrame frame = new JFrame("JTable Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JTable table = new JTable(data, new String[] {"Column1", "Column2"});
                JScrollPane scrollPane = new JScrollPane(table);
                frame.getContentPane().add(scrollPane);

                frame.pack();
                frame.setVisible(true);

                int rowCount = table.getRowCount();
                System.out.println("Number of rows: " + rowCount);
            }
        });
    }
}
