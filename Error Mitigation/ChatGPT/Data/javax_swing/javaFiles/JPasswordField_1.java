import javax.swing.JPasswordField;

public class JPasswordField_1 {
    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        char[] password = passwordField.getPassword();
        System.out.println(password);
    }
}
