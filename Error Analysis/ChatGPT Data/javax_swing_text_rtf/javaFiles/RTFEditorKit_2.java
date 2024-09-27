import javax.swing.text.rtf.RTFEditorKit;
import javax.swing.text.Document;
import java.io.OutputStream;

public class RTFEditorKit_2 {
    public static void main(String[] args) {
        
    }

    public static void write(OutputStream out, Document doc, int pos, int len) {
        RTFEditorKit rtfEditorKit = new RTFEditorKit();
        try {
            rtfEditorKit.write(out, doc, pos, len);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
