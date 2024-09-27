import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_1 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        
        // Add some attributes
        attributes.addAttribute("", "name1", "name1", "CDATA", "value1");
        attributes.addAttribute("", "name2", "name2", "CDATA", "value2");
        
        System.out.println("Attributes before clearing: " + attributes.getLength());
        
        // Clear all attributes
        attributes.clear();
        
        System.out.println("Attributes after clearing: " + attributes.getLength());
    }
}
