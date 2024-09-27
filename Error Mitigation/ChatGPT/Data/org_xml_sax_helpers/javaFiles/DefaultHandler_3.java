import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

public class MyHandler extends DefaultHandler {
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        // Add your custom implementation here
        System.out.println("End of element: " + qName);
    }
}

public class DefaultHandler_3 {
    public static void main(String[] args) {
        MyHandler handler = new MyHandler();
        try {
            handler.endElement("http://example.com", "element", "prefix:element");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
