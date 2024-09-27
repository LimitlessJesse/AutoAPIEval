import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

public class JTextPane_5 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        textPane.setText("Hello World!");

        replaceSelection(textPane, "Universe");
        System.out.println(textPane.getText()); // Output: Universe World!
    }

    public static void replaceSelection(JTextPane textPane, String content) {
        try {
            int start = textPane.getSelectionStart();
            int end = textPane.getSelectionEnd();
            if (start != end) {
                textPane.getDocument().remove(start, end - start);
            }
            textPane.getDocument().insertString(start, content, null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
