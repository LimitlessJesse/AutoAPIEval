import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_13 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.warning(new SAXParseException("Warning message", new Exception()));
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
