import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.XMLReader;
import org.xml.sax.SAXException;

public class XMLFilterImpl_1 {
    public static void main(String[] args) {
        XMLReader parent = null;
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.setParent(parent);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
