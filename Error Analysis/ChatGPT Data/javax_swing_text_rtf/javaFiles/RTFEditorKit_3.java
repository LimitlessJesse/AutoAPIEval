import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.StringWriter;
import java.io.Writer;

public class RTFEditorKit_3 {
    public static void main(String[] args) {
        RTFEditorKit rtfEditorKit = new RTFEditorKit();
        Document doc = rtfEditorKit.createDefaultDocument();
        String text = "This is a sample text";
        
        try {
            Writer out = new StringWriter();
            out.write(text);
            
            int pos = 0;
            int len = text.length();
            rtfEditorKit.write(out, doc, pos, len);
            
            String rtfContent = out.toString();
            System.out.println(rtfContent);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
