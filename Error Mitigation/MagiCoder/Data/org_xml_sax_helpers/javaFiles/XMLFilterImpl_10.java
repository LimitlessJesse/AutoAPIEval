import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_10 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl();
        try {
            filter.ignorableWhitespace(new char[]{' ','',''}, 0, 3);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
