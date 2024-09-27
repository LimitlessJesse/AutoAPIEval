import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_5 {
    public static void main(String[] args) {
        AttributeListImpl attributeList = new AttributeListImpl();
        attributeList.add("name1", "value1");
        attributeList.add("name2", "value2");
        
        String value = attributeList.getValue("name1");
        System.out.println("Value for name1: " + value);
    }
}
