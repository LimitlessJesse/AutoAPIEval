import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;

public class BasicComboBoxEditor_3 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        BasicComboBoxEditor editor = (BasicComboBoxEditor) comboBox.getEditor();
        JComponent editorComponent = editor.getEditorComponent();

        // You can now use the editor component as you wish
        // For example, you can add it to a JFrame or JPanel
        JFrame frame = new JFrame();
        frame.add(editorComponent);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
