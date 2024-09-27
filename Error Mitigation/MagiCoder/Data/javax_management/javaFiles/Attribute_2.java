import javax.management.Attribute;

public class Attribute_2 {
    public static void main(String[] args) {
        Attribute attribute = new Attribute("name", "value");
        String name = attribute.getName();
        System.out.println("Attribute name: " + name);
    }
}
