import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_2 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void endDocument() throws SAXException {
                System.out.println("End of document reached");
            }
        };

        // Here you would call your SAX parser and pass the handler
        // For the sake of this example, we'll just call the method
        try {
            handler.endDocument();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
