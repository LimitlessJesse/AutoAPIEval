import javax.swing.JFormattedTextField;

public class JFormattedTextField_4 {
    public static void main(String[] args) {
        JFormattedTextField textField = new JFormattedTextField();
        textField.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
    }
}
