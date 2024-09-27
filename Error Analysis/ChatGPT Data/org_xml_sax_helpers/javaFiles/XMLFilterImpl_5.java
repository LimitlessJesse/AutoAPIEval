import org.xml.sax.Attributes;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_5 extends XMLFilterImpl {
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        System.out.println("Start Element: " + qName);
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Attribute: " + attributes.getQName(i) + " = " + attributes.getValue(i));
        }
    }

    public static void main(String[] args) {
        // Code to test the startElement method
    }
}
