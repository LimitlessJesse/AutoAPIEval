import javax.naming.directory.BasicAttribute;
import javax.naming.directory.Attribute;
import java.util.List;

public class BasicAttribute_14 {
    public static void main(String[] args) {
        BasicAttribute attribute = new BasicAttribute("name");
        attribute.add("value1");
        attribute.add("value2");
        System.out.println(attribute.hashCode());
    }
}
