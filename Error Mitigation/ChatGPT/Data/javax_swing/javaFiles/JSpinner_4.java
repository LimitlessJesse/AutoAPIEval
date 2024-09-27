import javax.swing.JComponent;
import javax.swing.JSpinner;

public class JSpinner_4 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        JComponent editor = spinner.getEditor();
        
        // Set a new editor for the spinner
        spinner.setEditor(editor);
    }
}
