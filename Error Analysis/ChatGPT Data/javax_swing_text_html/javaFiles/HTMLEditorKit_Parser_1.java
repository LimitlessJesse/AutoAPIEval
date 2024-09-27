import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.StringReader;
import java.io.IOException;

public class HTMLEditorKit_Parser_1 {
    public static void main(String[] args) {
        String html = "<html><body><h1>Hello World</h1></body></html>";
        HTMLEditorKit.ParserCallback callback = new HTMLEditorKit.ParserCallback() {
            public void handleText(char[] data, int pos) {
                System.out.println(new String(data));
            }
        };

        try {
            StringReader reader = new StringReader(html);
            HTMLEditorKit.Parser parser = new ParserDelegator();
            parser.parse(reader, callback, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
