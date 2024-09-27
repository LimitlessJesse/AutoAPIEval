import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.Document;
import java.io.StringReader;
import javax.swing.text.BadLocationException;
import java.io.IOException;

public class HTMLEditorKit_3 {
    public static void main(String[] args) {
        HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
        Document doc = htmlEditorKit.createDefaultDocument();
        String htmlContent = "<html><body><h1>Hello, World!</h1></body></html>";
        
        try {
            htmlEditorKit.read(new StringReader(htmlContent), doc, 0);
            System.out.println(doc.getText(0, doc.getLength()));
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
