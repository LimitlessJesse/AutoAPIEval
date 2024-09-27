import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;

public class JEditorPane_6 {
    public static void main(String[] args) throws BadLocationException {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setText("Hello, World!");
        System.out.println(editorPane.getText());
    }
}
