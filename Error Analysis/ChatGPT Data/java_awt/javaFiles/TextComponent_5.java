import java.awt.Color;
import java.awt.TextComponent;

public class TextComponent_5 {
    public static void main(String[] args) {
        TextComponent textComponent = new TextComponent();
        // Setting background color to red
        textComponent.setBackground(Color.RED);
        
        // Getting the background color of the text component
        Color backgroundColor = textComponent.getBackground();
        System.out.println("Background Color: " + backgroundColor);
    }
}
