import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_1 {
    public static void main(String[] args) {
        AttributeListImpl attrList = new AttributeListImpl();
        attrList.add("attr1", "value1");
        attrList.add("attr2", "value2");
        System.out.println("Length of the AttributeList: " + attrList.getLength());
    }
}
