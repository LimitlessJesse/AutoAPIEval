import javax.swing.text.Document;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLEditorKit;

import java.io.StringWriter;
import java.io.IOException;

public class HTMLEditorKit_2 {
    public static void main(String[] args) {
        HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
        Document doc = htmlEditorKit.createDefaultDocument();
        StringWriter out = new StringWriter();

        try {
            htmlEditorKit.write(out, doc, 0, doc.getLength());
            System.out.println(out.toString());
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
