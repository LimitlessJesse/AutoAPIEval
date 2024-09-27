import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class JTable_3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create a new JFrame
                JFrame frame = new JFrame("JTable Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a new JTable
                Object[][] data = {
                    {"John", "Doe", "Male", "30"},
                    {"Jane", "Doe", "Female", "28"},
                    {"Jim", "Doe", "Male", "50"},
                    {"Jill", "Doe", "Female", "45"}
                };
                String[] columns = {"First Name", "Last Name", "Gender", "Age"};
                JTable table = new JTable(data, columns);

                // Add the JTable to a JScrollPane
                JScrollPane scrollPane = new JScrollPane(table);

                // Add the JScrollPane to the JFrame
                frame.getContentPane().add(scrollPane);

                // Set the size of the JFrame
                frame.setSize(400, 300);

                // Make the JFrame visible
                frame.setVisible(true);

                // Get the value at a specific cell
                String value = (String) table.getValueAt(0, 0);
                System.out.println("Value at row 0, column 0: " + value);
            }
        });
    }
}
