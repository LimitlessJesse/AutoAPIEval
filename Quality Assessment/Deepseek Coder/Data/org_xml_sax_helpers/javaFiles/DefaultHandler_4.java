import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

public class DefaultHandler_4 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                System.out.println("End element: " + qName);
            }
        };

        // You can use this handler in your SAX parser here
    }
}
