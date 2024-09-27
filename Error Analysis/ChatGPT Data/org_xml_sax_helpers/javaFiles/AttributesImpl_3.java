import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_3 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "name1", "name1", "CDATA", "value1");
        System.out.println(attributes.getLocalName(0));
    }
}
