import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.SAXException;

public class XMLFilterImpl_11 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.processingInstruction("target", "data");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
