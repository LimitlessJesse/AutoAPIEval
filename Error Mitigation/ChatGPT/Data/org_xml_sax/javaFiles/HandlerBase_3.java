import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

public class HandlerBase_3 {
    public static void main(String[] args) {
        HandlerBase handler = new HandlerBase() {
            @Override
            public void endDocument() throws SAXException {
                // Add specific actions to take at the end of the document
                System.out.println("End of document reached");
            }
        };

        try {
            handler.endDocument();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
