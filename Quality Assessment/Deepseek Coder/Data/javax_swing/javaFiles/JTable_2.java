import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class JTable_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                String[][] data = {
                    {"John", "Doe", "Male"},
                    {"Jane", "Doe", "Female"},
                    {"Jim", "Doe", "Male"}
                };

                String[] columnNames = {"First Name", "Last Name", "Gender"};

                JFrame frame = new JFrame("JTable Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JTable table = new JTable(data, columnNames);
                JScrollPane scrollPane = new JScrollPane(table);
                frame.getContentPane().add(scrollPane);

                frame.pack();
                frame.setVisible(true);

                int columnCount = table.getColumnCount();
                System.out.println("Number of columns: " + columnCount);
            }
        });
    }
}
