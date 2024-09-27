import javax.swing.plaf.basic.BasicComboBoxEditor;
import java.awt.event.ActionListener;

public class BasicComboBoxEditor_5 {
    public static void main(String[] args) {
        BasicComboBoxEditor editor = new BasicComboBoxEditor();
        
        ActionListener listener = e -> {
            System.out.println("Action Performed");
        };
        
        editor.addActionListener(listener);
    }
}
