import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_22 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "attribute1", "attr1", "String", "value1");
        attributes.addAttribute("", "attribute2", "attr2", "String", "value2");

        String qName = attributes.getQName(0);
        System.out.println(qName);  // Output: attribute1

        qName = attributes.getQName(1);
        System.out.println(qName);  // Output: attribute2
    }
}
