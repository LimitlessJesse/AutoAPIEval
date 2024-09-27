import javax.swing.JPasswordField;

public class JPasswordField_6 {
    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        System.out.println(new String(passwordField.getPassword()));
    }
}
