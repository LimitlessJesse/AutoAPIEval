import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_3 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.startDocument();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
