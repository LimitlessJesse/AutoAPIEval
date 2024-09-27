import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_2 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name", "name", "CDATA", "John");
        attributes.addAttribute("", "age", "age", "CDATA", "30");
        int index = attributes.getIndex("name");
        System.out.println("Index of 'name' attribute: " + index);
    }
}
