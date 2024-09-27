import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.SAXException;

public class XMLFilterImpl_6 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.endPrefixMapping("prefix");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
