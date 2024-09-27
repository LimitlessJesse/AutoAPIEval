import javax.swing.JComboBox;
import javax.swing.event.ListDataListener;

public class JComboBox_21 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItemListener(e -> System.out.println("Item selected: " + comboBox.getSelectedItem()));
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.removeItemListener(e -> System.out.println("Item selected: " + comboBox.getSelectedItem()));
    }
}
