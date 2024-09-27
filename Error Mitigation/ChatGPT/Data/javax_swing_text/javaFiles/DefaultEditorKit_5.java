import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;

import java.io.IOException;
import java.io.StringWriter;

public class DefaultEditorKit_5 {
    public static void main(String[] args) {
        DefaultEditorKit editorKit = new DefaultEditorKit();
        Document doc = editorKit.createDefaultDocument();
        StringWriter out = new StringWriter();

        try {
            editorKit.write(out, doc, 0, doc.getLength());
            System.out.println(out.toString());
        } catch (IOException | javax.swing.text.BadLocationException e) {
            e.printStackTrace();
        }
    }
}
