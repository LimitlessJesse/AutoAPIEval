import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLEditorKit;

public class JEditorPane_4 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");

        HTMLEditorKit editorKit = new HTMLEditorKit();
        editorPane.setEditorKit(editorKit);

        editorPane.setText("<html><body>Hello, World!!</body></html>");
        System.out.println(editorPane.getText());
    }
}
