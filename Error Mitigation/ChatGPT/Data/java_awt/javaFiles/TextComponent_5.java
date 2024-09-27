import java.awt.TextComponent;

public class TextComponent_5 {
    public static void main(String[] args) {
        TextComponent textComponent = new TextComponent();
        textComponent.setText("Example text");
        
        // Setting the selection end
        textComponent.setSelectionEnd(5);
        
        // Getting the selection end
        int selectionEnd = textComponent.getSelectionEnd();
        System.out.println("Selection End: " + selectionEnd);
    }
}
