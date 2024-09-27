import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

public class DefaultHandler_4 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startDocument() throws SAXException {
                // Add specific actions to be taken at the beginning of a document
                System.out.println("Document started");
            }
        };
        
        try {
            handler.startDocument();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
