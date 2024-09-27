import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_2 {
    public static void main(String[] args) {
        AttributeListImpl attributeList = new AttributeListImpl();
        String type = attributeList.getType(0);
        System.out.println("Type of attribute at index 0: " + type);
    }
}
