import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_4 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "value");
        System.out.println(attributes.getType(0));
    }
}
