import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

public class DefaultHandler_1 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startDocument() throws SAXException {
                System.out.println("Start of XML document");
            }
        };

        // You can then use the handler with your SAX parser
    }
}
