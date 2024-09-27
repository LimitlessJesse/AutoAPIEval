import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;

public class JSpinner_DefaultEditor_2 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) spinner.getEditor();
        JFormattedTextField textField = editor.getTextField();
        
        textField.setValue(10); // Set initial value
        System.out.println("Current value: " + textField.getValue());
    }
}
