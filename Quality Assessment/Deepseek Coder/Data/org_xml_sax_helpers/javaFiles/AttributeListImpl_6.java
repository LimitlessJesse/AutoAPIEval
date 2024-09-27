import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_6 {
    public static void main(String[] args) {
        AttributeListImpl attributes = new AttributeListImpl();
        attributes.add("name", "type", "value");
        String value = attributes.getValue("name");
        System.out.println(value);
    }
}
