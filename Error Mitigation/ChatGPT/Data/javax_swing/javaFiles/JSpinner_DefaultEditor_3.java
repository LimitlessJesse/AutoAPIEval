import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;

public class JSpinner_DefaultEditor_3 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        DefaultEditor editor = (DefaultEditor) spinner.getEditor();
        editor.commitEdit();
    }
}
