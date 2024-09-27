import javax.swing.JPasswordField;

public class JPasswordField_7 {
    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        char echoChar = passwordField.getEchoChar();
        System.out.println("Echo Char: " + echoChar);
    }
}
