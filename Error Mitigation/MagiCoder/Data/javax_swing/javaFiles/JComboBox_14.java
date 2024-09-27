import javax.swing.JComboBox;

public class JComboBox_14 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.setSelectedItem("Item 2");
        int selectedIndex = comboBox.getSelectedIndex();
        System.out.println("Selected index: " + selectedIndex);
    }
}
