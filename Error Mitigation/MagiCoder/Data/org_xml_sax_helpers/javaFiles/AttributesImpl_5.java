import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_5 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "value");
        System.out.println(attributes.getValue("name")); // Outputs: value
        attributes.clear();
        System.out.println(attributes.getValue("name")); // Outputs: null
    }
}
