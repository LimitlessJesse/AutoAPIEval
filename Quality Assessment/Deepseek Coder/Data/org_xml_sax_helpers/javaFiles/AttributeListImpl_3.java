import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_3 {
    public static void main(String[] args) {
        AttributeListImpl attrList = new AttributeListImpl();
        attrList.add("name", "value");
        String value = attrList.getValue(0);
        System.out.println(value);
    }
}
