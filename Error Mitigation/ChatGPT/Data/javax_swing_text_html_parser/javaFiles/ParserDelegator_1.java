import javax.swing.text.html.parser.ParserDelegator;
import javax.swing.text.html.HTMLEditorKit;

import java.io.IOException;
import java.io.Reader;

public class ParserDelegator_1 {
    public static void main(String[] args) {
        ParserDelegator parserDelegator = new ParserDelegator();
        HTMLEditorKit.ParserCallback callback = new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleText(char[] data, int pos) {
                System.out.println(new String(data));
            }
        };
        
        Reader reader = null; // Initialize your Reader object
        
        try {
            parserDelegator.parse(reader, callback, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
