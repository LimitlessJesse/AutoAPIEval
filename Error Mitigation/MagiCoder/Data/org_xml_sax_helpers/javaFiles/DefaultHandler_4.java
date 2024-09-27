import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_4 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                System.out.println("URI: " + uri);
                System.out.println("Local Name: " + localName);
                System.out.println("QName: " + qName);
            }
        };
    }
}
