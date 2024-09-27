import javax.naming.directory.BasicAttributes;
import javax.naming.directory.Attributes;

public class BasicAttributes_6 {
    public static void main(String[] args) {
        BasicAttributes attr1 = new BasicAttributes();
        BasicAttributes attr2 = new BasicAttributes();

        // Add some attributes to attr1
        attr1.put("name", "John");
        attr1.put("age", 30);

        // Add some attributes to attr2
        attr2.put("name", "John");
        attr2.put("age", 30);

        // Check if attr1 and attr2 are equal
        boolean areEqual = attr1.equals(attr2);

        System.out.println("Are attr1 and attr2 equal? " + areEqual);
    }
}
