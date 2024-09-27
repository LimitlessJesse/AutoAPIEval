import javax.swing.text.Document;
import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;

import java.io.StringWriter;
import java.io.IOException;

public class RTFEditorKit_2 {
    public static void main(String[] args) {
        RTFEditorKit rtfEditorKit = new RTFEditorKit();
        Document doc = rtfEditorKit.createDefaultDocument();
        try {
            StringWriter out = new StringWriter();
            doc.insertString(0, "This is a sample text", null);
            rtfEditorKit.write(out, doc, 0, doc.getLength());
            System.out.println(out.toString());
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
