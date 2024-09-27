import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_7 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "String", "John Doe");
        
        String localName = attributes.getLocalName(0);
        System.out.println(localName);  // Output: name
    }
}
