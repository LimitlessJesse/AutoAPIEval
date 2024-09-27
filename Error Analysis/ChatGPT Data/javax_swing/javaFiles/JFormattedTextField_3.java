import javax.swing.JFormattedTextField;

public class JFormattedTextField_3 {
    public static void main(String[] args) {
        JFormattedTextField formattedTextField = new JFormattedTextField();
        formattedTextField.setValue("12345");
        Object value = formattedTextField.getValue();
        System.out.println("Value from JFormattedTextField: " + value);
    }
}
