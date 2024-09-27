import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_11 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "String", "John Doe");
        
        String value = attributes.getValue("name");
        System.out.println(value);  // Output: John Doe
    }
}
