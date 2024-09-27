import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

public class JComboBox_23 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        ComboBoxUI comboBoxUI = comboBox.getUI();
        System.out.println(comboBoxUI.getClass().getName());
    }
}
