import java.awt.TextArea;

public class TextArea_3 {
    public static void main(String[] args) {
        TextArea textArea = new TextArea("Hello, World!");
        System.out.println("Before replace: " + textArea.getText());
        textArea.replaceRange("Java", 7, 12);
        System.out.println("After replace: " + textArea.getText());
    }
}
