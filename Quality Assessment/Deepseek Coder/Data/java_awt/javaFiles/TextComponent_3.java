import java.awt.TextComponent;
import javax.swing.JTextField;

public class TextComponent_3 {
    public static void main(String[] args) {
        TextComponent textComponent = new JTextField();
        textComponent.setText("Hello, World!");
        String text = textComponent.getText();
        System.out.println(text);
    }
}
