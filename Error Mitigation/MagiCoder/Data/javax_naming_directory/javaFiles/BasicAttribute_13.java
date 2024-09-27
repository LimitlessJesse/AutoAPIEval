import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

public class BasicAttribute_13 {
    public static void main(String[] args) {
        BasicAttribute attr1 = new BasicAttribute("attr1", "value1");
        BasicAttribute attr2 = new BasicAttribute("attr1", "value1");
        BasicAttribute attr3 = new BasicAttribute("attr2", "value1");

        System.out.println(attr1.equals(attr2));  // true
        System.out.println(attr1.equals(attr3));  // false
    }
}
