import javax.swing.JComboBox;

public class JComboBox_13 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.setSelectedItem("Item 2");

        Object selectedItem = comboBox.getSelectedItem();
        System.out.println("Selected item: " + selectedItem);
    }
}
