import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class XMLFilterImpl_7 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.startElement("http://www.example.com", "example", "example", new AttributesImpl());
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
