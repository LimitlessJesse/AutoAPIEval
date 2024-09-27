import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_2 {
    public static void main(String[] args) {
        AttributeListImpl attrList = new AttributeListImpl();
        attrList.add("name1", "value1");
        attrList.add("name2", "value2");
        attrList.add("name3", "value3");

        String name = attrList.getName(1);
        System.out.println(name);  // Output: name2
    }
}
