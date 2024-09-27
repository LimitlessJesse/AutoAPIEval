import javax.management.Attribute;

public class Attribute_4 {
    public static void main(String[] args) {
        Attribute attr1 = new Attribute("name", "John");
        Attribute attr2 = new Attribute("name", "John");
        Attribute attr3 = new Attribute("age", "30");

        boolean isEqual = attr1.equals(attr2);
        System.out.println("attr1 and attr2 are equal: " + isEqual);

        isEqual = attr1.equals(attr3);
        System.out.println("attr1 and attr3 are equal: " + isEqual);
    }
}
