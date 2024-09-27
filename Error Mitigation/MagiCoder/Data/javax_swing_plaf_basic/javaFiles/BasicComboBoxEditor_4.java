import javax.swing.plaf.basic.BasicComboBoxEditor;
import java.awt.event.ActionListener;

public class BasicComboBoxEditor_4 {
    public static void main(String[] args) {
        BasicComboBoxEditor editor = new BasicComboBoxEditor();
        ActionListener listener = e -> System.out.println("Action performed");
        editor.addActionListener(listener);
        editor.removeActionListener(listener);
    }
}
