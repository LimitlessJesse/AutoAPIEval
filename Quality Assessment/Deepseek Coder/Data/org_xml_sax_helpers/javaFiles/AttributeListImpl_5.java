import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_5 {
    public static void main(String[] args) {
        AttributeListImpl attrList = new AttributeListImpl();
        attrList.add("name", "0", "string");
        String type = attrList.getType(0);
        System.out.println("Type of attribute: " + type);
    }
}
