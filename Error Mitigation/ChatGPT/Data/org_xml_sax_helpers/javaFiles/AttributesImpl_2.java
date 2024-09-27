import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_2 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.setAttribute(0, "http://example.com", "attributeName", "qName", "string", "attributeValue");
    }
}
