import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_4 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "John Doe");
        
        AttributesImpl copiedAttributes = new AttributesImpl();
        copiedAttributes.setAttributes(attributes);
        
        System.out.println("Copied attributes: " + copiedAttributes);
    }
}
