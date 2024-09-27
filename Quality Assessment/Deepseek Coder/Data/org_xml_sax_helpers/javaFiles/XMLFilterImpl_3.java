import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.SAXException;
import java.io.IOException;

public class XMLFilterImpl_3 {
    public static void main(String[] args) {
        XMLFilterImpl xmlFilter = new XMLFilterImpl();
        try {
            xmlFilter.parse("http://example.com/sample.xml");
        } catch (IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
