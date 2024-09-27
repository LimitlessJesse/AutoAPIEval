import javax.swing.text.html.HTMLEditorKit;
import java.io.StringReader;
import java.io.Reader;

public class HTMLEditorKit_Parser_1 {
    public static void main(String[] args) {
        String html = "<html><body>Hello, World!!!</body></html>";
        Reader reader = new StringReader(html);
        HTMLEditorKit.ParserCallback callback = new HTMLEditorKit.ParserCallback() {
            // Implement the methods of ParserCallback here
        };
        new HTMLEditorKit().parse(reader, callback, true);
    }
}
