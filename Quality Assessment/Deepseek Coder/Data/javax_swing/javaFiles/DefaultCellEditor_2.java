import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DefaultCellEditor_2 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTable
        Object[][] data = {{"John", "Doe", "Male"}, {"Jane", "Doe", "Female"}, {"Jim", "Doe", "Male"}};
        String[] columnNames = {"First Name", "Last Name", "Gender"};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model) {
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (row % 2 == 0) {
                    c.setBackground(Color.white);
                } else {
                    c.setBackground(Color.lightGray);
                }
                return c;
            }
        };

        // Create a custom cell editor
        JTextField textField = new JTextField();
        DefaultCellEditor editor = new DefaultCellEditor(textField);

        // Set the custom cell editor for the table
        table.setDefaultEditor(Object.class, editor);

        // Add the JTable to the JFrame
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        // Set the size and make the JFrame visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
