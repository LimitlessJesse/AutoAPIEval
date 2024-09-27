import java.awt.TextComponent;

public class TextComponent_1 {
    public static void main(String[] args) {
        TextComponent textComponent = new TextComponent();
        textComponent.setText("Hello World");
        String text = textComponent.getText();
        System.out.println("Text content: " + text);
    }
}
