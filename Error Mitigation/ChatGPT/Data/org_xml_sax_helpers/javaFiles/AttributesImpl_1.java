import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_1 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "John Doe");
        System.out.println("Before clear: " + attributes.getLength());
        
        attributes.clear();
        System.out.println("After clear: " + attributes.getLength());
    }
}
