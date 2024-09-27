import javax.swing.JFormattedTextField;

public class JFormattedTextField_2 {
    public static void main(String[] args) {
        JFormattedTextField textField = new JFormattedTextField();
        textField.setValue(10); // Setting the value to be displayed
        System.out.println(textField.getValue()); // Retrieving the current value
    }
}
