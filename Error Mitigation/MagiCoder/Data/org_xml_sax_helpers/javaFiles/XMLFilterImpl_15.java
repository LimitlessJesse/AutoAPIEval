import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_15 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.fatalError(new SAXParseException("Fatal error occurred", new Exception()));
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
