import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.InputStream;

public class RTFEditorKit_1 {
    public static void main(String[] args) {
        try {
            RTFEditorKit rtfKit = new RTFEditorKit();
            Document doc = rtfKit.createDefaultDocument();
            InputStream inputStream = // Provide InputStream object here
            rtfKit.read(inputStream, doc, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
