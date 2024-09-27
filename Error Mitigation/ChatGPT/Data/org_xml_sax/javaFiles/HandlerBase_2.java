import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

public class HandlerBase_2 {
    public static void main(String[] args) {
        HandlerBase handler = new HandlerBase() {
            @Override
            public void startDocument() throws SAXException {
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
