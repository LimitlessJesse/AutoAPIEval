import javax.naming.directory.BasicAttributes;
import javax.naming.directory.Attributes;
import java.util.Hashtable;

public class BasicAttributes_19 {
    public static void main(String[] args) {
        Attributes attributes = new BasicAttributes();
        attributes.put("name", "John");
        attributes.put("age", "30");
        attributes.put("city", "New York");

        int size = attributes.size();
        System.out.println("Number of attributes: " + size);
    }
}
