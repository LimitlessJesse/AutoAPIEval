import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_4 {
    public static void main(String[] args) {
        XMLFilterImpl xmlFilter = new XMLFilterImpl() {
            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                // Your implementation of the endElement method goes here
            }
        };
    }
}
