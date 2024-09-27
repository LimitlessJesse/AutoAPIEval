import java.awt.TextComponent;

public class TextComponent_4 {
    public static void main(String[] args) {
        TextComponent textComponent = new TextComponent();
        textComponent.setText("Sample text");
        
        setCaretPosition(textComponent, 5);
    }

    public static void setCaretPosition(TextComponent textComponent, int position) {
        textComponent.setCaretPosition(position);
    }
}
