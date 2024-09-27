import javax.swing.text.Document;
import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.OutputStream;
import java.io.IOException;

public class RTFEditorKit_4 {
    public static void main(String[] args) {
        RTFEditorKit rtfEditorKit = new RTFEditorKit();
        Document doc = // initialize your document here

        try {
            OutputStream out = // initialize your output stream here
            int pos = // specify the position in the document
            int len = // specify the amount to write out

            rtfEditorKit.write(out, doc, pos, len);
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
