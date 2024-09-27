import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_2 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "John Doe");
        
        String value = attributes.getValue(0);
        System.out.println(value);  // Output: John Doe
    }
}
