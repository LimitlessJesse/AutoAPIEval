import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class JTable_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a JFrame
                JFrame frame = new JFrame("JTable Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a JTable
                Object[][] data = {{"John", "Doe", "Male"}, {"Jane", "Doe", "Female"}};
                String[] columns = {"First Name", "Last Name", "Gender"};
                JTable table = new JTable(data, columns);

                // Set a value at a specific cell
                table.setValueAt("Male", 1, 2);

                // Add the JTable to a JScrollPane
                JScrollPane scrollPane = new JScrollPane(table);

                // Add the JScrollPane to the JFrame
                frame.getContentPane().add(scrollPane);

                // Display the JFrame
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
