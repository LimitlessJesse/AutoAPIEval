import javax.swing.JPasswordField;

public class JPasswordField_4 {
    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setText("Hello World");
        System.out.println(new String(passwordField.getPassword()));
    }
}
