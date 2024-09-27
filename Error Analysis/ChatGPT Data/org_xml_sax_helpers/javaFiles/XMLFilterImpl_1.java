import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_1 extends XMLFilterImpl {
    public static void main(String[] args) {
        
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start of the document");
    }
}
