import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;

public class BasicComboBoxEditor_1 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        BasicComboBoxEditor editor = (BasicComboBoxEditor) comboBox.getEditor();
        editor.setItem("Item 2");

        System.out.println(comboBox.getSelectedItem());
    }
}
