import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JComboBox_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        frame.add(comboBox);

        frame.setVisible(true);

        // Select the second item
        comboBox.setSelectedIndex(1);

        // Get the index of the selected item
        int selectedIndex = comboBox.getSelectedIndex();

        // Display the index of the selected item
        JOptionPane.showMessageDialog(null, "The selected item index is: " + selectedIndex);
    }
}
