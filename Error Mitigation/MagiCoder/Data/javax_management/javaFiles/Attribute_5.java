import javax.management.Attribute;

public class Attribute_5 {
    public static void main(String[] args) {
        Attribute attr1 = new Attribute("name", "value");
        Attribute attr2 = new Attribute("name", "value");
        Attribute attr3 = new Attribute("name", "anotherValue");

        System.out.println(attr1.equals(attr2)); // true
        System.out.println(attr1.equals(attr3)); // false
    }
}
