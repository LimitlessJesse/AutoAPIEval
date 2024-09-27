import javax.swing.text.html.parser.DocumentParser;
import javax.swing.text.html.HTMLEditorKit;

import java.io.IOException;
import java.io.StringReader;

public class DocumentParser_1 {
    public static void main(String[] args) {
        DocumentParser parser = new DocumentParser();
        HTMLEditorKit.ParserCallback callback = new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleText(char[] data, int pos) {
                System.out.println(new String(data));
            }
        };
        
        try {
            String htmlContent = "<html><body><h1>Hello, World!</h1></body></html>";
            StringReader reader = new StringReader(htmlContent);
            parser.parse(reader, callback, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
