import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.IOException;
import java.io.StringReader;

public class HTMLEditorKit_ParserCallback_1 {
    public static void main(String[] args) {
        String html = "<html><body>Hello, World!!!</body></html>";
        HTMLEditorKit editorKit = new HTMLEditorKit();
        ParserDelegator delegator = (ParserDelegator) editorKit.getEditorKit().getParser();

        delegator.parse(new StringReader(html), editorKit.getDocument(), new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleText(char[] text, int pos) {
                // This method is called whenever text is encountered in the HTML document.
                // The text and its position in the document are passed as parameters.
                // You can process the text here.
                System.out.println(new String(text));
            }
        }, true);
    }
}
