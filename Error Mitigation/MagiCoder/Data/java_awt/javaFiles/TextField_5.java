import java.awt.TextField;

public class TextField_5 {
    public static void main(String[] args) {
        TextField textField = new TextField();
        char echoChar = textField.getEchoChar();
        System.out.println("Echo Char: " + echoChar);
    }
}
