import javax.management.Attribute;

public class Attribute_3 {
    public static void main(String[] args) {
        Attribute attribute = new Attribute("name", "value");
        Object value = attribute.getValue();
        System.out.println(value);
    }
}
