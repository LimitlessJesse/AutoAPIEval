import javax.swing.*;
import javax.swing.plaf.basic.BasicComboPopup;

public class BasicComboPopup_5 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        BasicComboPopup popup = new BasicComboPopup(comboBox);
        popup.show();
    }
}
