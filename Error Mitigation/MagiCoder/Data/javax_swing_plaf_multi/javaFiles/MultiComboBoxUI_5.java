import javax.swing.*;
import javax.swing.plaf.multi.MultiComboBoxUI;

public class MultiComboBoxUI_5 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setUI(new MultiComboBoxUI());
        comboBox.getUI().uninstallUI(comboBox);
    }
}
