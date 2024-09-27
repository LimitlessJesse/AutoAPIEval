import javax.swing.JComboBox;

public class JComboBox_4 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");

        String selectedItem = (String) comboBox.getSelectedItem();
        System.out.println("Selected Item: " + selectedItem);
    }
}
