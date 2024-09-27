import javax.swing.JComboBox;

public class JComboBox_26 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        // Select the second item
        comboBox.setSelectedIndex(1);
    }
}
