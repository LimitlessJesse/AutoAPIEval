import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.SAXException;

public class XMLFilterImpl_5 {
    public static void main(String[] args) {
        XMLFilterImpl xmlFilter = new XMLFilterImpl();
        try {
            xmlFilter.startDocument();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
