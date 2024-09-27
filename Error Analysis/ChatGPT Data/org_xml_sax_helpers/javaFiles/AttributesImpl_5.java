import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_5 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "John Doe");
        
        // Get the type of the attribute at index 0
        String type = attributes.getType(0);
        System.out.println("Type of attribute at index 0: " + type);
    }
}
