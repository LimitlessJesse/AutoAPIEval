import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;

public class JEditorPane_7 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setText("Hello, World!");
        
        try {
            String text = editorPane.getText();
            System.out.println(text);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
