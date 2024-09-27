import javax.swing.JComboBox;

public class JComboBox_7 {
    public static void main(String[] args) {
        // Create a JComboBox
        JComboBox<String> comboBox = new JComboBox<>();

        // Add items to the JComboBox
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        // Display the items in the JComboBox before removal
        System.out.println("Before removal: " + comboBox);

        // Remove an item from the JComboBox
        comboBox.removeItemAt(1);

        // Display the items in the JComboBox after removal
        System.out.println("After removal: " + comboBox);
    }
}
