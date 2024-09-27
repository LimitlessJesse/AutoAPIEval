import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicComboBoxEditor;

public class BasicComboBoxEditor_2 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.setSelectedItem("Item 2");

        BasicComboBoxEditor editor = (BasicComboBoxEditor) comboBox.getEditor();
        Object item = editor.getItem();

        System.out.println("Selected item: " + item);
    }
}
