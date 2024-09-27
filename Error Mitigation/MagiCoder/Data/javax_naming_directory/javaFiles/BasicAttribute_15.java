import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

public class BasicAttribute_15 {
    public static void main(String[] args) {
        BasicAttribute attr = new BasicAttribute("cn", "John Doe");
        System.out.println(attr.toString());
    }
}
