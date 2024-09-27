import java.awt.TextComponent;
import javax.swing.JTextField;

public class TextComponent_5 {
    public static void main(String[] args) {
        TextComponent textComponent = new JTextField();
        textComponent.setText("Hello, World!");
        int caretPosition = textComponent.getCaretPosition();
        System.out.println("Caret position: " + caretPosition);
    }
}
