import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_4 {
    public static void main(String[] args) {
        AttributeListImpl attrList = new AttributeListImpl();
        attrList.add("name", "value");
        String value = attrList.getValue("name");
        System.out.println(value);
    }
}
