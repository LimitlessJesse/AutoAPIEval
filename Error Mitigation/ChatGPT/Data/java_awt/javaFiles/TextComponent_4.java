import java.awt.TextComponent;

public class TextComponent_4 {
    public static void main(String[] args) {
        TextComponent textComponent = new TextComponent();
        textComponent.setText("Hello World");
        
        int selectionStart = 3;
        textComponent.setSelectionStart(selectionStart);
        
        System.out.println("Selection start set to: " + textComponent.getSelectionStart());
    }
}
