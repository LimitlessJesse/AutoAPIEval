import javax.swing.JComboBox;
import javax.swing.plaf.metal.MetalComboBoxUI;

public class JComboBox_22 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.setUI(new MetalComboBoxUI());
    }
}
