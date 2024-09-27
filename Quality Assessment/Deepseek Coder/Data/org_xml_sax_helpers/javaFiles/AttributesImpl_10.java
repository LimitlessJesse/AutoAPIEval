import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_10 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "type", "type", "String", "example");
        String type = attributes.getType(0);
        System.out.println(type);
    }
}
