import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_3 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                System.out.println("Start element: " + qName);
            }
        };

        // Here you would use a SAX parser to parse an XML document, passing your handler.
        // For the purpose of this example, we'll just call the startElement method directly.
        handler.startElement("http://example.com", "example", "exampleElement", null);
    }
}
