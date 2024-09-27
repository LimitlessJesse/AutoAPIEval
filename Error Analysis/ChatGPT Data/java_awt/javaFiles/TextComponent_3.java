import java.awt.TextComponent;

public class TextComponent_3 {
    public static void main(String[] args) {
        TextComponent textField = new TextComponent();
        textField.setText("Hello, World!");
        
        int caretPosition = textField.getCaretPosition();
        System.out.println("Caret position: " + caretPosition);
    }
}
