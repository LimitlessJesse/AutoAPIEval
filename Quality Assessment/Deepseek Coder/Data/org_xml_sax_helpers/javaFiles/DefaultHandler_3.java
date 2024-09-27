import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_3 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) {
                System.out.println("Start element: " + qName);
            }
        };

        // You can use this handler with a SAX parser to parse an XML document.
    }
}
