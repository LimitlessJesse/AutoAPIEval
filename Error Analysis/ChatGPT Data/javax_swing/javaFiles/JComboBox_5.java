import javax.swing.JComboBox;

public class JComboBox_5 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");

        // Set the selected item
        String selectedItem = "Option 2";
        comboBox.setSelectedItem(selectedItem);
    }
}
