import javax.swing.JFormattedTextField;

public class JFormattedTextField_1 {
    public static void main(String[] args) {
        JFormattedTextField textField = new JFormattedTextField();
        textField.setValue(10); // Set a value for the text field
        Object value = textField.getValue(); // Get the last valid value
        System.out.println("Last valid value: " + value);
    }
}
