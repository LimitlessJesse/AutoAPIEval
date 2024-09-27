import javax.swing.JComboBox;

public class JComboBox_5 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        
        Object selectedItem = comboBox.getSelectedItem();
        System.out.println("Selected item: " + selectedItem);
    }
}
