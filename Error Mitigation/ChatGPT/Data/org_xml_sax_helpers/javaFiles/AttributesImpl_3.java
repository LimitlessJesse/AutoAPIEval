import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_3 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "John");
        attributes.removeAttribute(0);
    }
}
