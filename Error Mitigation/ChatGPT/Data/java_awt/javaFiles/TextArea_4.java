import java.awt.TextArea;

public class TextArea_4 {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.insert("Hello World", 5);
        System.out.println(textArea.getText());
    }
}
