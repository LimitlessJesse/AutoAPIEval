import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class JPasswordField_3 {
    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        JOptionPane.showInputDialog(null, "Enter your password", "Password", JOptionPane.PLAIN_MESSAGE, null, null, "");
        passwordField.requestFocus();

        String password = new String(passwordField.getPassword());
        System.out.println("Entered password: " + password);
    }
}
