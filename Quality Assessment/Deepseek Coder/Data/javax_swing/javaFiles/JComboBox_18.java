import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JComboBox_18 {
    public static void main(String[] args) {
        // Create a JComboBox
        JComboBox<String> comboBox = new JComboBox<>();

        // Add items to the JComboBox
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        // Create a JFrame to hold the JComboBox
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(comboBox);
        frame.pack();
        frame.setVisible(true);

        // Set the selected item
        comboBox.setSelectedItem("Item 2");

        // Show the selected item
        JOptionPane.showMessageDialog(null, "Selected item: " + comboBox.getSelectedItem());
    }
}
