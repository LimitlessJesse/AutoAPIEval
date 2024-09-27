import java.awt.TextComponent;

public class TextComponent_1 {
    public static void main(String[] args) {
        TextComponent textComponent = new TextComponent();
        
        // Set the text component as editable
        textComponent.setEditable(true);
        
        // Check if the text component is editable
        boolean isEditable = textComponent.isEditable();
        System.out.println("Is text component editable? " + isEditable);
    }
}
