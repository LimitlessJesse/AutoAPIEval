import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.Reader;
import java.io.StringReader;

public class RTFEditorKit_5 {
    public static void main(String[] args) {
        try {
            RTFEditorKit rtfEditorKit = new RTFEditorKit();
            Document doc = rtfEditorKit.createDefaultDocument();
            Reader in = new StringReader("{\\rtf1\\ansi\\ansicpg1252\\deff0\\nouicompat\\deflang1033{\\fonttbl{\\f0\\fnil\\fcharset0 Calibri;}}\n" +
                    "{\\*\\generator Riched20 10.0.19041}\\viewkind4\\uc1 \n" +
                    "\\pard\\f0\\fs22\\lang9 This is some text in RTF format.}\\par");
            
            int pos = 0;
            rtfEditorKit.read(in, doc, pos);
            System.out.println(doc.getText(0, doc.getLength()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
