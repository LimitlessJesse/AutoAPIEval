import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_12 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.skippedEntity("entityName");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
