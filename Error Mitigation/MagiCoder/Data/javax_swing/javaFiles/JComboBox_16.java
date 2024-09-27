import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JComboBox_16 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>(new DefaultComboBoxModel<>(new String[] {"Item1", "Item2", "Item3"}));
        comboBox.removeItem("Item2");
    }
}
