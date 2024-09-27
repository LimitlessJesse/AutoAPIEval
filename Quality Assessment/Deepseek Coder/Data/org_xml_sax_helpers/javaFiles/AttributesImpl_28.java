import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_28 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "uri", "localName", "CDATA", "value");
        int index = attributes.getIndex("uri", "localName");
        System.out.println("Index: " + index);
    }
}
