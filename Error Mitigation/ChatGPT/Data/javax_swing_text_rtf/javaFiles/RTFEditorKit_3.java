import javax.swing.text.Document;
import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.InputStream;
import java.io.IOException;

public class RTFEditorKit_3 {
    public static void main(String[] args) {
        RTFEditorKit rtfEditorKit = new RTFEditorKit();
        Document doc = rtfEditorKit.createDefaultDocument();
        try {
            InputStream in = RTFEditorKit_3.class.getResourceAsStream("example.rtf");
            rtfEditorKit.read(in, doc, 0);
            System.out.println(doc.getText(0, doc.getLength()));
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
