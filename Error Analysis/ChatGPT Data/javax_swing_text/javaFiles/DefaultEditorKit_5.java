import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import java.io.StringWriter;
import java.io.Writer;

public class DefaultEditorKit_5 {
    public static void main(String[] args) {
        DefaultEditorKit editorKit = new DefaultEditorKit();
        Document doc = editorKit.createDefaultDocument();
        StringWriter out = new StringWriter();

        try {
            editorKit.write(out, doc, 0, doc.getLength());
            System.out.println(out.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
