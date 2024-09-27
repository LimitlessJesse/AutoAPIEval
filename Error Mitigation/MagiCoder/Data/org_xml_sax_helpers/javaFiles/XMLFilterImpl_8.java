import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_8 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.endElement("http://www.example.com", "example", "example");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
