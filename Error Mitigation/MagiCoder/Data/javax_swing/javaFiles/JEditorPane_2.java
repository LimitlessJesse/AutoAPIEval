import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLEditorKit;
import java.io.StringReader;

public class JEditorPane_2 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("<html><body>Hello, World!</body></html>");
        System.out.println(editorPane.getText());
    }
}
