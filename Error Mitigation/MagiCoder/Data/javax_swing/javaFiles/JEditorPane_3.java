import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.io.IOException;
import java.io.StringWriter;

public class JEditorPane_3 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setText("Hello, World!");
        try {
            System.out.println(editorPane.getText());
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
