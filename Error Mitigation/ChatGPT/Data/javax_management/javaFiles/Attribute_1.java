import javax.management.Attribute;

public class Attribute_1 {
    public static void main(String[] args) {
        Attribute attribute = new Attribute("attributeName", "attributeValue");
        String attributeName = attribute.getName();
        System.out.println("Attribute Name: " + attributeName);
    }
}
