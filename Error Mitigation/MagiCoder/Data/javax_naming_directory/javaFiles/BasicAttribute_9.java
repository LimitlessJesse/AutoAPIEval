import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

public class BasicAttribute_9 {
    public static void main(String[] args) {
        BasicAttribute attribute = new BasicAttribute("attrName");
        attribute.add("value1");
        attribute.add("value2");
        attribute.add("value3");

        System.out.println("Before removal: " + attribute);

        attribute.remove("value2");

        System.out.println("After removal: " + attribute);
    }
}
