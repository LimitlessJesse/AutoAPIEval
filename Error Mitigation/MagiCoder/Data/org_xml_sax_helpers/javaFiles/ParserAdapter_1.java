import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.ContentHandler;

public class ParserAdapter_1 {
    public static void main(String[] args) {
        ParserAdapter parserAdapter = new ParserAdapter();
        ContentHandler contentHandler = new ContentHandler() {
            // Implement your ContentHandler methods here
        };
        parserAdapter.setContentHandler(contentHandler);
    }
}
