import javax.swing.text.html.HTMLEditorKit;
import java.io.IOException;
import java.io.Reader;

public class HTMLEditorKit_Parser_1 {
    public static void main(String[] args) {
        HTMLEditorKit.ParserCallback callback = new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleText(char[] data, int pos) {
                System.out.println(new String(data));
            }
        };

        Reader reader = null; // Initialize your Reader object here

        try {
            HTMLEditorKit.Parser parser = new HTMLEditorKit().getParser();
            parser.parse(reader, callback, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
