import javax.swing.text.Document;
import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.StringReader;
import java.io.IOException;

public class RTFEditorKit_1 {
    public static void main(String[] args) {
        RTFEditorKit rtfEditorKit = new RTFEditorKit();
        Document doc = rtfEditorKit.createDefaultDocument();
        String text = "This is a sample text to insert into the document.";
        
        try {
            rtfEditorKit.read(new StringReader(text), doc, 0);
            System.out.println(doc.getText(0, doc.getLength()));
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
