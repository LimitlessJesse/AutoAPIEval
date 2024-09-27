import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_5 extends DefaultHandler {
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        // Add your custom implementation here
        System.out.println("Start Element: " + qName);
    }

    public static void main(String[] args) {
        DefaultHandler_5 handler = new DefaultHandler_5();
        try {
            handler.startElement("http://example.com", "element", "prefix:element", null);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
