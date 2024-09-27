import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_1 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startDocument() throws SAXException {
                System.out.println("Start of document");
            }
        };

        try {
            // Here you would call your SAX parser with the handler
            // saxParser.parse(inputSource, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
