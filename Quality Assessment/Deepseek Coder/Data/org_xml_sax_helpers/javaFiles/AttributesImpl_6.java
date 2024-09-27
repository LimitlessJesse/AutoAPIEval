import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_6 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "attribute1", "attribute1", "String", "value1");
        attributes.addAttribute("", "attribute2", "attribute2", "String", "value2");

        String uri1 = attributes.getURI(0);
        String uri2 = attributes.getURI(1);

        System.out.println("URI of attribute1: " + uri1);
        System.out.println("URI of attribute2: " + uri2);
    }
}
