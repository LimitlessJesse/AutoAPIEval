import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_1 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "String", "John Doe");
        System.out.println("Length of attributes: " + attributes.getLength());
    }
}
