import javax.swing.JComboBox;

public class JComboBox_11 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        boolean isEditable = comboBox.isEditable();
        System.out.println("Is the JComboBox editable? " + isEditable);
    }
}
