import org.xml.sax.helpers.AttributeListImpl;

public class AttributeListImpl_3 {
    
    public static void main(String[] args) {
        String attributeName = "example";
        String type = getType(attributeName);
        System.out.println("Type of attribute '" + attributeName + "' is: " + type);
    }

    public static String getType(String name) {
        AttributeListImpl attList = new AttributeListImpl();
        attList.addAttribute(name, "value");

        return attList.getType(name);
    }

}
