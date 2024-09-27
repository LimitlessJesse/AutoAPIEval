import javax.management.Attribute;

public class Attribute_5 {
    public static void main(String[] args) {
        Attribute attribute1 = new Attribute("name", "value");
        Attribute attribute2 = new Attribute("name", "value");

        boolean result = attribute1.equals(attribute2);
        System.out.println("Are the attributes equal? " + result);
    }
}
