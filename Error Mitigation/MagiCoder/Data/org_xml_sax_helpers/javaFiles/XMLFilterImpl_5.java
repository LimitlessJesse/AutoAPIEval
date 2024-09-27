import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.SAXException;

public class XMLFilterImpl_5 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.startPrefixMapping("prefix", "uri");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
