import javax.swing.JEditorPane;

public class JEditorPane_4 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        String contentType = editorPane.getContentType();
        System.out.println("Content Type: " + contentType);
    }
}
