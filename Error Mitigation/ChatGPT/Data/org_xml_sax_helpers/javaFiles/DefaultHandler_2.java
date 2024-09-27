import org.xml.sax.SAXException;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_2 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void endDocument() throws SAXException {
                // Perform specific actions at the end of the document
                System.out.println("End of the document");
            }
        };
    }
}
