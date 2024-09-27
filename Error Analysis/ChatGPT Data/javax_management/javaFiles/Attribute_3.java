import javax.management.Attribute;

public class Attribute_3 {
    public static void main(String[] args) {
        Attribute attribute = new Attribute("Name", "John Doe");
        String attributeName = attribute.getName();
        System.out.println("Attribute name: " + attributeName);
    }
}
