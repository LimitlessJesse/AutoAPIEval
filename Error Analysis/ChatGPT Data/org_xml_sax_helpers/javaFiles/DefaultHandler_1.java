import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start Element: uri=" + uri + ", localName=" + localName + ", qName=" + qName);
        
        for (int i = 0; i < attributes.getLength(); i++) {
            String attrName = attributes.getLocalName(i);
            String attrValue = attributes.getValue(i);
            System.out.println("Attribute: " + attrName + "=" + attrValue);
        }
    }
}

public class DefaultHandler_1 {
    public static void main(String[] args) {
        DefaultHandler handler = new MyHandler();
        
        // We can now use this handler to parse XML
    }
}
