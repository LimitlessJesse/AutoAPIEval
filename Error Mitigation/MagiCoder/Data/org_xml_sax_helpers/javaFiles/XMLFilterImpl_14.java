import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_14 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.error(new SAXParseException("Test error", new Exception()));
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
