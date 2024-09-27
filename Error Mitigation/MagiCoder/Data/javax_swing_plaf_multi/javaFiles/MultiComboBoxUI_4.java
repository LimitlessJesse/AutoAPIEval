import javax.swing.*;
import javax.swing.plaf.multi.MultiComboBoxUI;

public class MultiComboBoxUI_4 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        MultiComboBoxUI multiComboBoxUI = new MultiComboBoxUI();
        multiComboBoxUI.installUI(comboBox);
    }
}
