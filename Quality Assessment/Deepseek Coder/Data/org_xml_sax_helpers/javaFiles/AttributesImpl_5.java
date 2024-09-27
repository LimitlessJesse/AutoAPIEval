import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_5 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "John Doe");
        String type = attributes.getType("", "name");
        System.out.println("Type of attribute 'name': " + type);
    }
}
