import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_4 {
    public static void main(String[] args) {
        AttributeListImpl attributes = new AttributeListImpl();
        attributes.addAttribute("name", "John Doe");
        attributes.addAttribute("age", "30");
        
        for (int i = 0; i < attributes.getLength(); i++) {
            String value = attributes.getValue(i);
            System.out.println(value);
        }
    }
}
