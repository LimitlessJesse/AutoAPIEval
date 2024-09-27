import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_1 {
    public static void main(String[] args) {
        XMLFilterImpl filter = new XMLFilterImpl() {
            @Override
            public void startDocument() throws SAXException {
                // Filter start document event
                System.out.println("Start document event filtered");
            }
        };

        try {
            filter.startDocument();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
