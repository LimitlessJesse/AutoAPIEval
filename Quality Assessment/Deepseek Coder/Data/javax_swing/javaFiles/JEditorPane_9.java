import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;

public class JEditorPane_9 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setText("This is a sample text.");

        // Select the text to be replaced
        editorPane.selectAll();

        // Replace the selected text
        try {
            editorPane.replaceSelection("Replaced text");
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        // Print the updated text
        System.out.println(editorPane.getText());
    }
}
