import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class RTFEditorKit_4 {
    public static void main(String[] args) {
        RTFEditorKit rtfEditorKit = new RTFEditorKit();
        Document doc = rtfEditorKit.createDefaultDocument();

        // Sample RTF content
        String rtfContent = "{\\rtf1\\ansi\\ansicpg1252\\deff0\\nouicompat\\deflang1033{\\fonttbl{\\f0\\fnil\\fcharset0 Calibri;}}\n" +
                "{\\*\\generator Riched20 10.0.19041}\\viewkind4\\uc1 \n" +
                "\\pard\\sa200\\sl276\\slmult1\\f0\\fs22\\lang9 Example RTF content\\par\n" +
                "}\n";

        try {
            byte[] rtfBytes = rtfContent.getBytes();
            ByteArrayInputStream stream = new ByteArrayInputStream(rtfBytes);
            rtfEditorKit.read(stream, doc, 0);
            String contentType = rtfEditorKit.getContentType();
            System.out.println("Content Type: " + contentType);
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
