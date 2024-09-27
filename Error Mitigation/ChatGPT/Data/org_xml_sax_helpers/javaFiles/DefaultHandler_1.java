import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

public class DefaultHandler_1 extends DefaultHandler {
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        // Receive notification of character data inside an element
        // Add your specific actions here
    }

    public static void main(String[] args) {
        // Your main method code here
    }
}
