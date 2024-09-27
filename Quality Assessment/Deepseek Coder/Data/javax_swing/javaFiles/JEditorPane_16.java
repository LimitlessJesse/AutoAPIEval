import javax.swing.JEditorPane;
import javax.swing.text.EditorKit;

public class JEditorPane_16 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        EditorKit editorKit = editorPane.getEditorKit();
        System.out.println(editorKit);
    }
}
