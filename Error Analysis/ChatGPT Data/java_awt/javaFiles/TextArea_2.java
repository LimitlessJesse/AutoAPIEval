import java.awt.TextArea;

public class TextArea_2 {
    public static void main(String[] args) {
        // Create a new TextArea
        TextArea textArea = new TextArea();

        // Insert a string at position 5
        textArea.insert("World", 5);

        // Print the text in the TextArea
        System.out.println(textArea.getText());
    }
}
