import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_14 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "attribute1", "attribute1", "String", "value1");
        attributes.addAttribute("", "attribute2", "attribute2", "String", "value2");

        int index = attributes.getIndex("attribute1");
        System.out.println("Index of 'attribute1': " + index);
    }
}
