import javax.swing.JComboBox;

public class JComboBox_24 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setEditable(true); // Set the JComboBox to be editable

        // Add items to the JComboBox
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        // Print the JComboBox
        System.out.println(comboBox);
    }
}
