import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_2 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl() {
            @Override
            public void endDocument() throws SAXException {
                // Filter end document event
            }
        };
    }
}
