import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_9 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.characters(new char[]{'H', 'e', 'l', 'l', 'o'}, 0, 5);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
