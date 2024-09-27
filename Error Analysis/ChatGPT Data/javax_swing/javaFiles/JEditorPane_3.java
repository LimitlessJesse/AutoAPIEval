import javax.swing.JEditorPane;

public class JEditorPane_3 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        System.out.println("Content type set to: " + editorPane.getContentType());
    }
}
