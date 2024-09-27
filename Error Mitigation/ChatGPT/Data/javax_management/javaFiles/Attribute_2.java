import javax.management.Attribute;

public class Attribute_2 {
    public static void main(String[] args) {
        Attribute attribute = new Attribute("attributeName", "attributeValue");
        Object value = attribute.getValue();
        System.out.println("Attribute value: " + value);
    }
}
