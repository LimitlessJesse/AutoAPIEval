import java.awt.TextArea;

public class TextArea_5 {
    public static void main(String[] args) {
        TextArea textArea = new TextArea("Initial text");
        System.out.println("Before replace: " + textArea.getText());
        
        textArea.replaceRange("Replacement text", 8, 14);
        System.out.println("After replace: " + textArea.getText());
    }
}
